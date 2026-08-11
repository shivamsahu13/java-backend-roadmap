package com.shivam.day06;

public class MainStudent {

    public static void main(String[] args){

        Student student1 = new Student();
        student1.id = 101;
        student1.name = "Amit";
        student1.marks = 85;

        Student student2 = new Student();
        student2.id = 102;
        student2.name = "Rahul";
        student2.marks = 92;

        student1.displayStudent();
        student2.displayStudent();

    }
}
