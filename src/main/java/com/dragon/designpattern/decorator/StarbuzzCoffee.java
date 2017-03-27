package com.dragon.designpattern.decorator;

/**
 * Created by dragon1990 on 17-3-26.
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new DarkRoast();
        System.out.println(beverage.getDescription()+"  "+beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        beverage2 = new Mocha(beverage2);

        System.out.println(beverage2.getDescription()+"  "+beverage.cost());
    }
}
