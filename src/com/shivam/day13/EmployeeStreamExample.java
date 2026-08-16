package com.shivam.day13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeStreamExample {

    public static void main(String[] args){

        List<Employee> employees  = new ArrayList<>();

        employees.add(new Employee("Shivam", 85000));
        employees.add(new Employee("Rahul", 65000));
        employees.add(new Employee("Amit", 95000));
        employees.add(new Employee("Vikas", 75000));
        employees.add(new Employee("Rohit", 120000));

        for(Employee employee : employees){
            System.out.println(employee.getName() + " - " + employee.getSalary());
        }

        employees.stream()
                .filter(employee-> employee.getSalary() > 80000)
                .forEach(employee-> System.out.println(employee.getName()));

        List<String> employeeNames = employees.stream().filter(employee -> employee.getSalary() > 80000)
                //.sorted(Comparator.comparing(Employee::getSalary))
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .map(employee -> employee.getName())
                .collect(Collectors.toList());

        System.out.println(employeeNames);
    }
}
