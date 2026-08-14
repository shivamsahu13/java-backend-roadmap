package com.shivam.day09;

public class Developer extends Employee {

    public String programmingLanguage;

    public Developer(int id, String name, double salary, String programmingLanguage){
        super(id, name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public void displayDeveloper(){
        dispalyEmployee();
        System.out.println("Language: " + programmingLanguage);
    }

    @Override
    public void dispalyEmployee() {
        System.out.println("Developer ID: " + id);
        System.out.println("Developer Name: " + name);
        System.out.println("Developer Salary: " + salary);
        System.out.println("Language: " + programmingLanguage);
    }
}
