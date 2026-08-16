package com.shivam.day13;

import java.util.ArrayList;

public class LamdaExample2 {

    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        for(Integer number : numbers){
            System.out.println(number);
        }

        numbers.forEach(number -> System.out.println(number));
    }
}
