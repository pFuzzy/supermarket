package com.codecool.supermarket.type;

public interface Refundable {
    default int calculateRefundPrice(int originalPrice,int daysSincePurchase){
        if(daysSincePurchase == 0){
            return originalPrice;
        }else if(daysSincePurchase <= 50){
            return originalPrice/ 2;
        }
        return 0;
    }
}