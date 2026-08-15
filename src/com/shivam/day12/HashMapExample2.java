package com.shivam.day12;

import java.util.HashMap;

public class HashMapExample2 {

    public static void main(String[] args){
        HashMap<String, Integer> marks = new HashMap<>();

        marks.put("Shivam", 85);
        marks.put("Rahul", 92);
        marks.put("Amit", 78);

        System.out.println(marks.get("Shivam"));
        System.out.println(marks.containsKey("Rahul"));
        marks.put("Amit", 88);
        marks.remove("Rahul");
        System.out.println(marks);
    }
}
