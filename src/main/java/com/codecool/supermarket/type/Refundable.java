package com.codecool.supermarket.type;

public interface Refundable {
    default int calculateRefundPrice(int originalPrice,int daysSincePurchase){
        int refundDayLimit = 50;
        if(daysSincePurchase == 0){
            return originalPrice;
        }else if(daysSincePurchase <= refundDayLimit){
            return originalPrice/ 2;
        }
        return 0;
    }
}