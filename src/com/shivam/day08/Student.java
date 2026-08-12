package com.shivam.day08;

public class Student {
    private int id;
    private String name;
    private double marks;

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setMarks(double marks){
        if(marks >= 0 && marks <= 100 ){
            this.marks = marks;
        }else{
            System.out.println("Invalid marks");
        }

    }

    public double getMarks(){
        return marks;
    }
}
