package com.shivam.day10;

public class Main {
    public  static void main(String[] args){
        /*Employee employee1 = new Developer(101, "Shivam");
        Employee employee2 = new Manager(102, "Rahul");
        Employee employee3 = new Tester(103, "Amit");
        employee1.work();
        employee2.work();
        employee3.work();*/

        Employee[] employees = {
                new Developer(101, "Shivam"),
                new Manager(102, "Rahul"),
                new Tester(103, "Amit")
        };

        for (Employee employee: employees){
                employee.work();
        }
    }
}
