package com.shivam.day10;

public class Developer extends Employee {

    public Developer(int id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println(name + " is writing Java code");
    }
}
