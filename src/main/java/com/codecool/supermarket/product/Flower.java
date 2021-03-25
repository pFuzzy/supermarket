package com.codecool.supermarket.product;

import com.codecool.supermarket.type.MustBeMaintained;

public class Flower extends Product implements MustBeMaintained {
    private int age;
    private final int basePrice = 1000;
    private final int weeksPerYear = 52;
    private final int yearsOfNeededMaintenance = 3;

    public Flower(String name) {
        super(name);
    }

    @Override
    public int calculatePrice() {
        return basePrice + age * 2;
    }

    @Override
    public boolean needMaintenance(){
        return age <= yearsOfNeededMaintenance * weeksPerYear;
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
