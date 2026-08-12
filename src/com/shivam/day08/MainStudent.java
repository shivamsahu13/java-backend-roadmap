package com.shivam.day08;

public class MainStudent {

    public static void main(String[] args){

        Student student = new Student();
        student.setId(10);
        student.setName("Shivam");
        student.setMarks(100);

        System.out.println("Id: "+ student.getId());
        System.out.println("Name: "+ student.getName());
        System.out.println("Marks: "+ student.getMarks());

        student.setMarks(85);
        student.setMarks(150);

    }

}
