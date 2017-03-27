package com.dragon.designpattern.factory.factoryMethod;

import com.dragon.designpattern.factory.factoryMethod.Pizza;

/**
 * Created by dragon1990 on 17-3-26.
 */
public class NYStyleCheesePizza extends Pizza {
    NYStyleCheesePizza(){
        name = "CHicage Style Deep Dish Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }
}
