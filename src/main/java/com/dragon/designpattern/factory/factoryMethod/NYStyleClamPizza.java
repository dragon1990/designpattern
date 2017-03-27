package com.dragon.designpattern.factory.factoryMethod;

import com.dragon.designpattern.factory.factoryMethod.Pizza;

/**
 * Created by dragon1990 on 17-3-26.
 */
public class NYStyleClamPizza extends Pizza {
    public NYStyleClamPizza(){
        System.out.println("creating NYStyleClamPizza");
    }
    @Override
    public void prepare() {
        System.out.println("prepare NYStyleClamPizza");
    }

    @Override
    public void bake() {
        System.out.println("bake NYStyleClamPizza");
    }

    @Override
    public void cut() {
        System.out.println("cut NYStyleClamPizza");
    }

    @Override
    public void box() {
        System.out.println("box NYStyleClamPizza");
    }
}
