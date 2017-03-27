package com.dragon.designpattern.factory.factoryMethod;

import com.dragon.designpattern.factory.factoryMethod.Pizza;

/**
 * Created by dragon1990 on 17-3-26.
 */
public class NYStylePepperoniPizza extends Pizza {
    NYStylePepperoniPizza(){
        System.out.println("creating NYStylePepperoniPizza");
    }
    @Override
    public void prepare() {
        System.out.println("prepare NYStylePepperoniPizza");
    }

    @Override
    public void bake() {
        System.out.println("bake NYStylePepperoniPizza");
    }

    @Override
    public void cut() {
        System.out.println("cut NYStylePepperoniPizza");
    }

    @Override
    public void box() {
        System.out.println("box NYStylePepperoniPizza ");
    }
}
