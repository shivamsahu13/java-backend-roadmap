package com.shivam.day03;

public class ArraySum {
    public static void main(String[] args) {

        int[] numbers = {25, 10, 45, 5, 80, 30};

        int sum = 0;
        for(int i=0; i< numbers.length; i++){
            sum = sum + numbers[i];

        }
        System.out.println(sum);
    }
}
