package com.codecool.supermarket;

import com.codecool.supermarket.product.Product;

import java.util.ArrayList;
import java.util.List;

public class Supermarket {
    private List<Product> products = new ArrayList<>();

    public void addProducts(List<Product> newProducts){
        products.addAll(newProducts);
    }

    public void displayAllPrices(){
        for(Product product: products){
            System.out.println(product.calculatePrice());
        }
    }
}
