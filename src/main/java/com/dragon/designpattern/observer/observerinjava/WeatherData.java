package com.dragon.designpattern.observer.observerinjava;

import java.util.Observable;

/**
 * Created by dragon1990 on 17-3-25.
 */
public class WeatherData extends Observable {
    /**
     * 温度
     */
    private Double temperature;
    /**
     * 湿度
     */
    private Double humidity;
    /**
     * 气压
     */
    private Double pressure;

    public void setMeasurement(Double temperature,Double humidity,Double pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        setChanged();
        notifyObservers();
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Double getHumidity() {
        return humidity;
    }

    public void setHumidity(Double humidity) {
        this.humidity = humidity;
    }

    public Double getPressure() {
        return pressure;
    }

    public void setPressure(Double pressure) {
        this.pressure = pressure;
    }
}
