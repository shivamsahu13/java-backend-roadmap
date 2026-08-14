package com.shivam.day09;

public class Employee {

    protected int id;
    protected String name;
    protected double salary;

    public Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void dispalyEmployee(){
        System.out.println("ID: "+ id);
        System.out.println("Name: "+ name);
        System.out.println("Salary: "+ salary);
    }
}
