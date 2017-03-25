package com.dragon.designpattern.observer;

/**
 *
 * Created by dragon1990 on 17-3-25.
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
        weatherData.setMeasurement(1.0,2.0,3.0);
        weatherData.setMeasurement(1.01,2.01,3.01);
        weatherData.setMeasurement(1.02,22.0,23.0);
    }
}
