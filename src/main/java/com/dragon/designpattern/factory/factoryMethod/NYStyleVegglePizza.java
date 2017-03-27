package com.dragon.designpattern.factory.factoryMethod;

import com.dragon.designpattern.factory.factoryMethod.Pizza;

/**
 * Created by dragon1990 on 17-3-26.
 */
public class NYStyleVegglePizza extends Pizza {
    public NYStyleVegglePizza(){
        System.out.println("creating NYStyleVegglePizza");
    }
    @Override
    public void prepare() {
        System.out.println("prepare NYStyleVegglePizza");
    }

    @Override
    public void bake() {
        System.out.println("bake NYStyleVegglePizza");
    }

    @Override
    public void cut() {
        System.out.println("cut NYStyleVegglePizza");
    }

    @Override
    public void box() {
        System.out.println("box NYStyleVegglePizza");
    }
}
