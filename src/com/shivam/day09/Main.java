package com.shivam.day09;

public class Main {
    public static void main(String[] args){
        Developer developer = new Developer(101, "Shivam", 85000, "Java");
        Manager manager = new Manager(102, "Rahul", 100000, 8);

//        developer.displayDeveloper();
        developer.dispalyEmployee();

        System.out.println();

        manager.displayManager();
        System.out.println();
        Tester tester = new Tester(103, "Amit", 70000, "Selenium");
        tester.displayTester();
    }

}
