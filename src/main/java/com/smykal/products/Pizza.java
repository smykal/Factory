package com.smykal.products;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String pie;
    String sos;
    ArrayList adds = new ArrayList();

    public void preparePizza() {
        System.out.println("prepare: " + name);
        System.out.println("bakeing " + pie);
        System.out.println("add sos " + sos);
        System.out.println("add ads ");
        for (int i = 0; i < adds.size(); i++) {
            System.out.println(" " + adds.get(i));
        }
    }
    public void bakePizza() {
        System.out.println("bakeing: 24 min in 351 farenheit deegres");
    }

    public void cutPizza() {
        System.out.println("cut for 8th pieces");
    }

    public void packPizza() {
        System.out.println("pack in nice box");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", pie='" + pie + '\'' +
                ", sos='" + sos + '\'' +
                ", adds=" + adds +
                '}';
    }
}
