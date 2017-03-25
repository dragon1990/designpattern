package com.dragon.designpattern.observer.observerinjava;

import com.dragon.designpattern.observer.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by dragon1990 on 17-3-25.
 */
public class CurrentConditionDisplay implements Observer,DisplayElement {

    private Observable observable;
    /**
     * 温度
     */
    private Double tempature;
    /**
     * 湿度
     */
    private Double humidity;

    CurrentConditionDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }
    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            this.tempature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    /**
     * 显示数据
     */
    @Override
    public void display() {
        System.out.println("Current conditions: "+tempature+"F degrees and "+humidity+" % humidity");
    }
}
