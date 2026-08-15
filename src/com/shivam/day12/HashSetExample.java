package com.shivam.day12;
import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {

        HashSet<String> names = new HashSet<>();

        names.add("Shivam");
        names.add("Amit");
        names.add("Rahul");
        names.add("Shivam");

        System.out.println(names);
    }
}
