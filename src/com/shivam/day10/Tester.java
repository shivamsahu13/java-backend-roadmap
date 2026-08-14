package com.shivam.day10;

public class Tester extends Employee{

    public Tester(int id, String name){
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println(name + " is testing the application");
    }
}
