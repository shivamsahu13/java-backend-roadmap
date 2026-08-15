package com.shivam.day12;

import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args){
        HashMap<Integer, String> employees = new HashMap<>();
        employees.put(101, "Shivam");
        employees.put(102, "Rahul");
        employees.put(103, "Amit");

        System.out.println(employees);

        System.out.println(employees.get(101));

        System.out.println(employees.containsKey(102));

        System.out.println(employees.containsValue("Amit"));

        employees.put(102, "Suresh");

        System.out.println(employees);

        employees.remove(103);

        System.out.println(employees);
    }
}
