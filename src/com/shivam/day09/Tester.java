package com.shivam.day09;

public class Tester extends Employee{

    private String testingTool;

    public Tester(int id, String name, double salary, String testingTool){
        super(id, name, salary);
        this.testingTool = testingTool;
    }

    public void displayTester(){
        dispalyEmployee();
        System.out.println("Testing Tool: " + testingTool);
    }
}
