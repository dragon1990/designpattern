package com.dragon.designpattern.decorator;

/**
 * Created by dragon1990 on 17-3-26.
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;
    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    double cost() {
        return 0.2+beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",Mocha";
    }

}
