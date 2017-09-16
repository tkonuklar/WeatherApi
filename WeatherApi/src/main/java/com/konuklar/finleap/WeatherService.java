package com.konuklar.finleap;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.apache.http.HttpStatus;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Created by tkonuklar on 16/09/2017.
 */
public class WeatherService {
    private final static String API_KEY = "a7dd2cb164e9d36fd88132349b82d878";

    public Weather getWeather(String cityName) {
        if(WeatherValidator.validateName(cityName)) {
            HttpResponse<JsonNode> jsonResponse = null;
            try {
                // api.openweathermap.org/data/2.5/forecast?id=524901&APPID=1111111111
                // api.openweathermap.org/data/2.5/weather?q=London

                jsonResponse = Unirest.get("http://api.openweathermap.org/data/2.5/forecast/daily")
                        .queryString("q", cityName)
                        .queryString("units", "metric")
                        .queryString("cnt", "1")
                        .queryString("APPID", API_KEY)
                        .asJson();

                if (jsonResponse.getStatus() == HttpStatus.SC_OK) {
                    JSONArray jsonList    = jsonResponse.getBody().getObject().getJSONArray("list");
                    JSONObject tempObject = jsonList.getJSONObject(0).getJSONObject("temp");

                    return new Weather(cityName,tempObject.getDouble("day"),
                            tempObject.getDouble("night"),jsonList.getJSONObject(0).getDouble("pressure"),jsonList.getJSONObject(0).getDouble("humidity"));
                } else {
                    return new Weather(cityName, ErrorCodes.HTTP_ERROR.getCode());
                }
            } catch(UnirestException e) {
                return new Weather(cityName, ErrorCodes.SERVER_ERROR.getCode());
            }
        }
        return new Weather(cityName, ErrorCodes.VALIDATION_ERROR.getCode());
   }
}