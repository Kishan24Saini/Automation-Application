package com.demo.endpoint;

public enum APIPath {
    WEATHER_GET_API("https://samples.openweathermap.org/data/2.5/forecast/hourly?q=London,us&appid=b6907d289e10d714a6e88b30761fae22");
    private String name;

    public String getApiPath(){
        return name;
    }

    APIPath(String apiEndpoint) {
        name=apiEndpoint;
    }

    @Override
    public String toString() {
        return name;
    }
}
