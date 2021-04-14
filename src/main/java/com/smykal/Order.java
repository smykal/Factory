package com.smykal;

import com.smykal.fabric.AmericanPizza;
import com.smykal.fabric.ItalianPizza;
import com.smykal.fabric.Pizzeria;
import com.smykal.products.Pizza;

public class Order {
    public static void main(String[] args) {
        Pizzeria italian = new ItalianPizza();
        Pizzeria american = new AmericanPizza();

        Pizza pizza = italian.orderPizza("cheese");
        System.out.println("pierwszy placek to : " + pizza.getName() + "\n");

        pizza = american.orderPizza("texas");
        System.out.println("drugi placek to: " + pizza.getName());
    }
}
