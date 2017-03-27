package com.dragon.designpattern.factory.factoryMethod;

import com.dragon.designpattern.factory.factoryMethod.Pizza;

/**
 * Created by dragon1990 on 17-3-26.
 */
public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza(){
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese");
    }
    void cut(){
        System.out.println("Cutting the pizza into square clices");
    }
}
