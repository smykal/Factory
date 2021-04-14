package com.smykal.fabric;

import com.smykal.products.*;

public class ItalianPizza extends Pizzeria {

    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ItalianCheesePizza();
        } else if (item.equals("wege")) {
            return new ItalianWegePizza();
        } else if (item.equals("fruitDiMare")) {
            return new ItalianFrutiDiMarePizza();
        } else if (item.equals("pepperoni")) {
            return new ItalianPepperoniPizza();
        } else return null;
    }
}
