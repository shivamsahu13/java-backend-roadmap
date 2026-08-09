package com.shivam.day03;

public class FindMinimum {
    public static void main(String[] args) {

        int[] numbers = {25, 10, 45, 5, 80, 30};
        int min = numbers[0];
        for(int i=0; i< numbers.length; i++){
            if(min > numbers[i]){
                min = numbers[i];
            }

        }
        System.out.println(min);
    }
}
