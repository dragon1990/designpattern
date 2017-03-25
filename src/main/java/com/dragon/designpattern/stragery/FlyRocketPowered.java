package com.dragon.designpattern.stragery;

/**
 * Created by dragon1990 on 17-3-25.
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
