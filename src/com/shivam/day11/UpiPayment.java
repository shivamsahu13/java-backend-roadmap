package com.shivam.day11;

public class UpiPayment extends Payment implements PaymentGateway,Refundable {

    public UpiPayment(double amount){
        super(amount);
    }

    @Override
    public void makePayment() {
        System.out.println("Processing UPI payment of " + amount);
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("UPI gateway processing: " + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunding UPI payment: " + amount);
    }
}
