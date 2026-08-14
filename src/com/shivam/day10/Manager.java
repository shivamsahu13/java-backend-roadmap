package com.shivam.day10;

public class Manager extends Employee {

    public Manager(int id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println(name + " is managing the team");
    }
}
