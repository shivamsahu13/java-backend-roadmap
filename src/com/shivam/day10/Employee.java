package com.shivam.day10;

public class Employee {
    protected int id;
    protected String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void work() {
        System.out.println(name + " is working as an employee");
    }
}
