package com.dragon.designpattern.observer;

/**
 * Created by dragon1990 on 17-3-25.
 */
public class HeatIndexDisplay implements Observer,DisplayElement {
    /**
     *酷热指数
     */
    private Double hotIndex;

    /**
     * 主题对象
     */
    private Subject subject;

    /**
     * 构造函数
     * @param subject
     */
    public HeatIndexDisplay(Subject subject){
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Head index is "+hotIndex);
    }

    @Override
    public void update(Double tempature, Double humidity, Double pressure) {
        this.hotIndex = computeHeatIndex(tempature,humidity);
        display();
    }
    private Double computeHeatIndex(Double tempature, Double humidity) {
        Double index = (Double) ((16.923 + (0.185212 * tempature) + (5.37941 * humidity)
                - (0.100254 * tempature * humidity) + (0.00941695 * (tempature * tempature))
                + (0.00728898 * (humidity * humidity)) + (0.000345372 * (tempature * tempature * humidity))
                - (0.000814971 * (tempature * humidity * humidity))
                + (0.0000102102 * (tempature * tempature * humidity * humidity))
                - (0.000038646 * (tempature * tempature * tempature)) + (0.0000291583 * (humidity * humidity * humidity))
                + (0.00000142721 * (tempature * tempature * tempature * humidity))
                + (0.000000197483 * (tempature * humidity * humidity * humidity))
                - (0.0000000218429 * (tempature * tempature * tempature * humidity * humidity)) + 0.000000000843296 * (tempature
                * tempature * humidity * humidity * humidity)) - (0.0000000000481975 * (tempature * tempature * tempature * humidity
                * humidity * humidity)));
        return index;
    }
}
