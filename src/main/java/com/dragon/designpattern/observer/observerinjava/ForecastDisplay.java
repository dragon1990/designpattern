package com.dragon.designpattern.observer.observerinjava;

import com.dragon.designpattern.observer.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by dragon1990 on 17-3-25.
 */
public class ForecastDisplay implements Observer,DisplayElement{
    private Double currentPressure = 29.92;
    private Double lastPressure;
    private Observable observable;
    ForecastDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }
    /**
     * 显示数据
     */
    @Override
    public void display() {
        System.out.println("current pressure is"+currentPressure+" last pressure is "+lastPressure);
    }

    /**
     * This method is called whenever the observed object is changed. An
     * application calls an <tt>Observable</tt> object's
     * <code>notifyObservers</code> method to have all the object's
     * observers notified of the change.
     *
     * @param o   the observable object.
     * @param arg an argument passed to the <code>notifyObservers</code>
     */
    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }
}
