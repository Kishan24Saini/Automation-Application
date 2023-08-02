package com.demo.util;

import com.demo.pojo.WeatherData;

import java.time.LocalDate;
import java.util.Date;

public class WeatherDataUtil {

    public static String getTemperature(WeatherData weatherData, String date) {
        Date localDate = DateTimeParsing.getStringToDate(date);
       return weatherData.getList().stream().filter(list -> DateTimeParsing.getStringToDate(list.getDtTxt().split(" ")[0]).compareTo(localDate)==0).findFirst().get().getMain().getTemp().toString();
    }

    public static String getWindSpeed(WeatherData weatherData, String date) {
        Date localDate = DateTimeParsing.getStringToDate(date);
        return weatherData.getList().stream().filter(list -> DateTimeParsing.getStringToDate(list.getDtTxt().split(" ")[0]).compareTo(localDate)==0).findFirst().get().getWind().getSpeed().toString();
    }

    public static String getPressure(WeatherData weatherData, String date) {
        Date localDate = DateTimeParsing.getStringToDate(date);
        return weatherData.getList().stream().filter(list -> DateTimeParsing.getStringToDate(list.getDtTxt().split(" ")[0]).compareTo(localDate)==0).findFirst().get().getMain().getPressure().toString();
    }
}
