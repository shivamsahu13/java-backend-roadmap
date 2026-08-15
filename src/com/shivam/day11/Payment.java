package com.shivam.day11;

public abstract class Payment {

    protected double amount;

    public Payment(double amount){
        this.amount = amount;
    }

    public abstract void makePayment();

    public void paymentInfo(){
        System.out.println("Payment Amount: " + amount);
    }
}
