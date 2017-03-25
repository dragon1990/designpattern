package com.dragon.designpattern.stragery;

/**
 * Created by dragon1990 on 17-3-25.
 */
public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
    }
}
