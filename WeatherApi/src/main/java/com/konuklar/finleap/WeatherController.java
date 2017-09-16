package com.konuklar.finleap;

import static spark.Spark.*;

/**
 * Created by tkonuklar on 16/09/2017.
 */
public class WeatherController {
    public WeatherController(final WeatherService weatherService) {
        get("/weather/:cityName", (request, response) -> {
                return weatherService.getWeather(request.params(":cityName"));
            }, new JsonTransformer());
    }
}