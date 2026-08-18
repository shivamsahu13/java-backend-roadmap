package com.shivam.day15;

import java.util.List;

public class MainExample {

    public static void main(String[] args){
        /*Box<String> stringBox = new Box<>();
        stringBox.setValue("Shivam");

        System.out.println(stringBox.getValue());

        Box<Integer> numberBox = new Box<>();
        numberBox.setValue(100);

        System.out.println(numberBox.getValue());*/

        /*printValue("Shivam");
        printValue(100);
        printValue(85.5);*/

        /*String name = getValue("Shivam");
        Integer number = getValue(100);
        Double salary = getValue(85000.500);
        System.out.println(name);
        System.out.println(number);
        System.out.println(salary);*/

        /*printNumber(100);
        printNumber(85.5);
        printNumber(100L);
        printNumber("Shivam");*/

        List<String> names = List.of("Shivam", "Rahul", "Amit");
        List<Integer> numbers = List.of(10, 20, 30);

        printList(names);
        printList(numbers);

    }

    public static <T> void printValue(T value){
        System.out.println(value);
    }

    public static <T> T getValue(T value){
        return value;
    }

    public static <T extends Number> void printNumber(T number){
        System.out.println(number);
    }

    public static <T> void printList(List<T> list){
        for(T value : list){
            System.out.println(value);
        }
    }

}
