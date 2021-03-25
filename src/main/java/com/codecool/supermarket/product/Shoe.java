package com.codecool.supermarket.product;

import com.codecool.supermarket.type.Refundable;

public class Shoe extends Product implements Refundable {
    private final int size;

    public Shoe(String name, int size) {
        super(name);
        this.size = size;
    }

    @Override
    public int calculatePrice() {
        if(size > 40){
            return 15000;
        }
        return 14000;
    }
}
