package com.dragon.designpattern.decorator;

/**
 * Created by dragon1990 on 17-3-26.
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;
    public Whip(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    double cost() {
        return 0.34+beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",whip ";
    }
}
