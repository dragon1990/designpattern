package com.dragon.designpattern.chap01;

/**
 * Created by dragon1990 on 17-3-25.
 */
public abstract class Duck {
    //飞行行为
    FlyBehavior flyBehavior;
    //叫行为
    QuackBehavior quackBehavior;

    Duck(){

    }
    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    void display() {
        System.out.println("display");
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
