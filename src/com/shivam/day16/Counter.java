package com.shivam.day16;

public class Counter {
    int count = 0;

    public void increment(){
        synchronized (this) {
            count++;
        }
    }
}
