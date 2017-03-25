package com.dragon.designpattern.stragery;

/**
 * Created by dragon1990 on 17-3-25.
 */
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly");
    }
}
