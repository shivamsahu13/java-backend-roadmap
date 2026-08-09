package com.shivam.day03;

public class EvenNumbers {
    public static void main(String[] args) {

        int[] numbers = {25, 10, 45, 5, 80, 30};
        for(int i=0; i< numbers.length; i++){
            if(numbers[i]%2 == 0){
                System.out.println("even: "+ numbers[i]);
            }

        }
    }
}
