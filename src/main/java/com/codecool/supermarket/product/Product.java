package com.codecool.supermarket.product;


import com.codecool.supermarket.type.ForSale;

public abstract class Product implements ForSale {
    private final String name;

    public Product(String name) {
        this.name = name;
    }
}
