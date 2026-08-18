package com.shivam.day15;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {

    public static void main(String[] args) {

        addNumbers(new ArrayList<>());

    }
    public static void addNumbers(List<? super Integer> list){
        list.add(10);
        list.add(20);
        list.add(30);

        /*for (Object number : list) {
            System.out.println(number);
        }*/

        System.out.println(list);

    }
}
