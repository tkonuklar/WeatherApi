package com.konuklar.finleap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by tkonuklar on 16/09/2017.
 */
public class WeatherValidator {
    private static String CITY_PATTERN = "^[a-zA-Z\\u0080-\\u024F\\s\\/\\-\\)\\(\\`\\.\\\"\\']+$";
    private static Pattern pattern;

    static {
        pattern = Pattern.compile(CITY_PATTERN);
    }

    static boolean validateName(String cityName) {
        if(cityName != null && cityName.trim().length() != 0) {
            Matcher matcher = pattern.matcher(cityName);
            return matcher.matches();
        }
        return false;
    }
}