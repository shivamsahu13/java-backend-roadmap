package com.shivam.day09;

public class Manager extends Employee {

    public int teamSize;

    public Manager(int id, String name, double salary, int teamSize){
        super(id, name, salary);
        this.teamSize = teamSize;
    }

    public void displayManager() {
        dispalyEmployee();
        System.out.println("Team Size: " + teamSize);
    }
}
