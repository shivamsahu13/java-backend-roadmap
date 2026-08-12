package com.shivam.day07;

public class Student {
    int id;
    String name;
    double marks;

    public Student(int id, String name, double marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public Student(){

    }

    void displayStudent(){
        System.out.println("ID : "+ id);
        System.out.println("Name : "+ name);
        System.out.println("Marks : "+ marks);
    }
}
