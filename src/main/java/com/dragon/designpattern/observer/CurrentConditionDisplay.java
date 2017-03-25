package com.dragon.designpattern.observer;

/**
 * 目前状况布告板
 * Created by dragon1990 on 17-3-25.
 */
public class CurrentConditionDisplay implements Observer,DisplayElement {

    /**
     * 被观察的主题
     */
    private Subject subject;
    /**
     * 温度
     */
    private Double tempature;
    /**
     * 湿度
     */
    private Double humidity;

    /**
     * 构造函数
     * @param subject
     */
    public CurrentConditionDisplay(Subject subject){
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: "+tempature+"F degrees and "+humidity+" % humidity");
    }

    @Override
    public void update(Double tempature, Double humidity, Double pressure) {
        this.tempature = tempature;
        this.humidity = humidity;
        display();
    }
}
