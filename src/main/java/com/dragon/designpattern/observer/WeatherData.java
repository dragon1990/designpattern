package com.dragon.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dragon1990 on 17-3-25.
 */
public class WeatherData implements Subject {
    /***
     * 所有的观察者
     */
    private List<Observer> observers;
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

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature,humidity, pressure);
        }
    }

    public void setMeasurement(Double temperature,Double humidity,Double pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }
}

