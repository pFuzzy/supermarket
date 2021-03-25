package com.codecool.supermarket;

import com.codecool.supermarket.product.Flower;
import com.codecool.supermarket.product.Shoe;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class SupermarketApplication {

    public static void main(String[] args) {
        SpringApplication.run(SupermarketApplication.class, args);
        Supermarket supermarket = new Supermarket();
        Shoe adidas = new Shoe("Adidas", 44);
        Shoe reebok = new Shoe("Reebok", 40.5);
        Shoe nike = new Shoe("Nike", 38);
        Flower lily = new Flower("Lily");
        lily.setAge(8);
        Flower hyacinth = new Flower("Hyacinth");
        hyacinth.setAge(1);
        supermarket.addProducts(Arrays.asList(adidas,reebok,nike,lily,hyacinth));

        supermarket.displayAllPrices();

    }

}
