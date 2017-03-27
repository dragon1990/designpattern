package com.dragon.designpattern.factory.factoryMethod;

/**
 * Created by dragon1990 on 17-3-26.
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("Ethan ordered a "+pizza.name);

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a "+pizza.name);
    }
}
