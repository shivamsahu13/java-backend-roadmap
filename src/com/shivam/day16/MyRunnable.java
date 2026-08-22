package com.shivam.day16;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(
                "Runnable thread: " +
                        Thread.currentThread().getName()
        );
    }
}
