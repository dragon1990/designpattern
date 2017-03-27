package com.dragon.designpattern.decorator;

/**
 * Created by dragon1990 on 17-3-26.
 */
public abstract class Beverage {
    /**
     * 描述
     */
    String description = "Unknown Beverage";
    abstract double cost();

    public String getDescription() {
        return description;
    }
}
