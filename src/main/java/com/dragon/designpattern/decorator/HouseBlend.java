package com.dragon.designpattern.decorator;

/**
 * Created by dragon1990 on 17-3-26.
 */
public class HouseBlend extends Beverage {
    @Override
    public String getDescription() {
        return "House Blend Coffee";
    }

    @Override
    double cost() {
        return 0.89;
    }
}
