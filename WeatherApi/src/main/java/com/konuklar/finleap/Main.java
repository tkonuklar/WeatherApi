package com.konuklar.finleap;

/**
 * Created by tkonuklar on 16/09/2017.
 */
public class Main {
    public static void main(String[] args) {
        new WeatherController(new WeatherService());
    }
}