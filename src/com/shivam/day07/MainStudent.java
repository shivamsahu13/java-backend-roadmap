package com.shivam.day07;

public class MainStudent {

    public static void main(String[] args){
        //Student student1 = new Student(101, "Amit", 85);
        Student student1 = new Student();
        Student student2 = new Student(102, "Rahul", 92);
        student1.displayStudent();
        student2.displayStudent();
    }
}
