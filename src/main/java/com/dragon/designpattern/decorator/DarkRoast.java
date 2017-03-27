package com.dragon.designpattern.decorator;

/**
 * Created by dragon1990 on 17-3-26.
 */
public class DarkRoast extends Beverage {
    public DarkRoast(){

    }
    @Override
    double cost() {
        return 0;
    }
}
