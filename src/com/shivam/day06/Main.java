package com.shivam.day06;

public class Main {

    public static void main(String[] args){
       /* Employee employee = new Employee();
        employee.id = 1;
        employee.name = "Ram";
        employee.salary = 200.0;
        employee.displayEmployee();*/

        Employee employee1 = new Employee();
        employee1.id = 101;
        employee1.name = "Ram";
        employee1.salary = 85000;

        Employee employee2 = new Employee();
        employee2.id= 102;
        employee2.name = "Shyam";
        employee2.salary = 5000;

        employee1.displayEmployee();
        employee2.displayEmployee();
    }
}
