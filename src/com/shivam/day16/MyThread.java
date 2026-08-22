package com.shivam.day16;

public class MyThread extends Thread{

    @Override
    public void run() {
        System.out.println("My thread: " +
                Thread.currentThread().getName());
    }
}
