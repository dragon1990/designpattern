package com.dragon.designpattern.chap01;

/**
 * 绿头鸭
 * Created by dragon1990 on 17-3-25.
 */
public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWIngs();
    }

    @Override
    void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
