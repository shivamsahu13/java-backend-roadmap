package com.shivam.day11;

public class CardPayment extends Payment {

    public CardPayment(double amount){
        super(amount);
    }

    @Override
    public void makePayment() {
        System.out.println("Processing Card payment of " + amount);
    }
}
