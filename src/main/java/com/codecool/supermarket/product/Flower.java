package com.codecool.supermarket.product;

import com.codecool.supermarket.type.MustBeMaintained;

public class Flower extends Product implements MustBeMaintained {
    private int age;

    public Flower(String name, int age) {
        super(name);
        this.age = age;
    }

    @Override
    public int calculatePrice() {
        return 1000 + age * 2;
    }

    @Override
    public boolean needMaintenance() {
        return age < 3 * 52;
    }

    @Override
    public void maintain() {
        System.out.println("Flower watered!");

    }
}
