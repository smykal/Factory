package com.smykal.fabric;

import com.smykal.products.*;

public class MexicanPizza extends Pizzeria {

    Pizza createPizza(String item) {
        if (item.equals("tequila")) {
            return new MexicanTequilaPizza();
        } else if (item.equals("nacho")) {
            return new MexicanNachoPizza();
        } else if (item.equals("sombrero")) {
            return new MexicanSombreroPizza();
        } else if (item.equals("paseala")) {
            return new MexicanPasealaPizza();
        } else return null;
    }

}
