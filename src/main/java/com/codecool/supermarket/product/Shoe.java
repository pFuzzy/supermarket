package com.codecool.supermarket.product;

import com.codecool.supermarket.type.Refundable;

public class Shoe extends Product implements Refundable {
    private final double size;
    private final double priceIncreaseSize = 40;
    private final int cheaperPrice = 14000;
    private final int greaterPrice = 15000;

    public Shoe(String name, double size) {
        super(name);
        this.size = size;
    }

    @Override
    public int calculatePrice() {
        if(size > priceIncreaseSize){
            return greaterPrice;
        }
        return cheaperPrice;
    }
}
