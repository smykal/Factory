package com.smykal.fabric;

import com.smykal.products.*;

public class AmericanPizza extends Pizzeria {

    Pizza createPizza(String item) {
        if (item.equals("bbq")) {
            return new AmericanBbqPizza();
        } else if (item.equals("texas")) {
            return new AmericanTexasPizza();
        } else if (item.equals("california")) {
            return new AmericanCaliforniaPizza();
        } else if (item.equals("arizona")) {
            return new AmericanArizonaPizza();
        } else return null;
    }
}
