package com.dragon.designpattern.factory.factoryMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dragon1990 on 17-3-26.
 */
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<>();
    void prepare(){
        System.out.println("Preparing "+name);
        System.out.println("Tossing dough...");
        System.out.println("Adding souce...");
        System.out.println("Adding toppings: ");
        for(int i=0;i<toppings.size();i++){
            System.out.println("  "+toppings.get(i));
        }
    }

    void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box(){
        System.out.println("Place pizza in offical PizzaStore box");
    }

}
