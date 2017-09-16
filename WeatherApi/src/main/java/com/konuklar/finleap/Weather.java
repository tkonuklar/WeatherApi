package com.konuklar.finleap;

/**
 * Created by tkonuklar on 16/09/2017.
 */
public class Weather {
    private String name;
    private double dailyTemp;
    private double nightlyTemp;
    private double pressure;
    private double humidity;
    private int    errorCode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDailyTemp() {
        return dailyTemp;
    }

    public void setDailyTemp(double dailyTemp) {
        this.dailyTemp = dailyTemp;
    }

    public double getNightlyTemp() {
        return nightlyTemp;
    }

    public void setNightlyTemp(double nightlyTemp) {
        this.nightlyTemp = nightlyTemp;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public Weather(String name, double dailyTemp, double nightlyTemp, double pressure, double humidity) {
        super();
        this.name        = name;
        this.dailyTemp   = dailyTemp;
        this.nightlyTemp = nightlyTemp;
        this.pressure    = pressure;
        this.humidity    = humidity;
        this.errorCode   = ErrorCodes.SUCCESS.getCode();
    }

    public Weather(String name, int errorCode) {
        super();
        this.name        = name;
        this.errorCode   = errorCode;
    }

    public static Weather dummyWeather(String dummyName) {
        Weather dummy = new Weather(dummyName, 12.0, 15.5, 10.12, 13.5);
        return dummy;
    }
}