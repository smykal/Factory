package com.smykal.fabric;

import com.smykal.products.Pizza;

public abstract class Pizzeria {

    abstract Pizza createPizza(String typeOfPizza);

    public Pizza orderPizza(String typeOfPizza) {
        Pizza pizza;
        pizza = createPizza(typeOfPizza);
        pizza.preparePizza();
        pizza.bakePizza();
        pizza.cutPizza();
        pizza.packPizza();
        return pizza;
    }
}
