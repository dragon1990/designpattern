package com.dragon.designpattern.factory.factoryMethod;

/**
 * Created by dragon1990 on 17-3-26.
 */
public class NYPizzaStore extends PizzaStore {
    private Pizza pizza;

    @Override
    public Pizza createPizza(String type) {
        if(type.equals("cheese")){
            pizza = new NYStyleCheesePizza();
        }else if(type.equals("pepperoni")){
            pizza = new NYStylePepperoniPizza();
        }else if(type.equals("clam")){
            pizza = new NYStyleClamPizza();
        }else if(type.equals("veggle")){
            pizza = new NYStyleVegglePizza();
        }
        return pizza;
    }
}
