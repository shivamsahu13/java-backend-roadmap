package com.shivam.day13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args){

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);

        /*numbers.stream()
                .filter(number-> number%2==0)
                .forEach(number->System.out.println(number));*/
        /*numbers.stream()
                .filter(number-> number%2==0)
                .map(number->number*number)
                .forEach(number->System.out.println(number));*/

        List<Integer> evenNumbers = numbers.stream()
                .filter(number->number%2==0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers);

        List<Integer> allNumbers = numbers.stream()
                .map(number->number*number)
                .collect(Collectors.toList());
        System.out.println(allNumbers);

        List<Integer> sortedNumber = numbers
                                    .stream()
                                    .sorted()
                                    .collect(Collectors.toList());
        System.out.println(sortedNumber);

        List<Integer> sortedNumberDesc = numbers
                .stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(sortedNumberDesc);

        List<Integer> numbersWithDuplicates = new ArrayList<>();

        numbersWithDuplicates.add(10);
        numbersWithDuplicates.add(20);
        numbersWithDuplicates.add(10);
        numbersWithDuplicates.add(30);
        numbersWithDuplicates.add(20);
        numbersWithDuplicates.add(40);

        List<Integer> uniqueNumbers = numbersWithDuplicates.stream()
                .distinct()
                .sorted()
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(uniqueNumbers);

    }
}
