package com.shivam.day16;

public class Volatile {

    private volatile boolean running = true;

    public void stop(){
        running = false;
    }

    public void work(){
        while(running){
            // do work
        }
        System.out.println("Worker stopped");
    }
}
