package com.shivam.day11;

public class Main {

    public static void main(String[] args){
        Payment upi = new UpiPayment(1000);
        Payment card = new CardPayment(2000);

        upi.paymentInfo();
        upi.makePayment();

        card.paymentInfo();
        card.makePayment();
    }
}
