package com.shivam.day03;

public class FindMaximum {

    public static void main(String[] args) {

        int[] numbers = {25, 10, 45, 5, 80, 30};
        int max = numbers[0];
        for(int i=0; i< numbers.length; i++){
            if(max < numbers[i]){
                max = numbers[i];
            }

        }
        System.out.println(max);
    }
}
