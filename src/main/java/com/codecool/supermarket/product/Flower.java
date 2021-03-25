package com.codecool.supermarket.product;

import com.codecool.supermarket.type.MustBeMaintained;

public class Flower extends Product implements MustBeMaintained {
    private int age;

    public Flower(String name) {
        super(name);
    }

    @Override
    public int calculatePrice() {
        return 1000 + age * 2;
    }

    @Override
    public boolean needMaintenance() {
        return age <= 3 * 52;
    }

    @Override
    public void maintain() {
        System.out.println("Flower watered!");

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
