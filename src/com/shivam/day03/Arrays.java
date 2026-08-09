package com.shivam.day03;

public class Arrays {

    public static void main(String[] args) {

        int[] numbers = {25, 10, 45, 5, 80, 30};

       /* System.out.println(numbers[0]);
        System.out.println(numbers[2]);
        System.out.println(numbers[5]);*/
        /*for(int i=0; i< numbers.length; i++){
            System.out.println(numbers[i]);
        }*/
        /*int max = numbers[0];
        for(int i=0; i< numbers.length; i++){
            if(max < numbers[i]){
                max = numbers[i];
            }

        }
        System.out.println(max);*/
        /*int min = numbers[0];
        for(int i=0; i< numbers.length; i++){
            if(min > numbers[i]){
                min = numbers[i];
            }

        }
        System.out.println(min);*/
        /*int sum = 0;
        for(int i=0; i< numbers.length; i++){
            sum = sum + numbers[i];

        }
        //System.out.println(sum);
        double average = 0;
        average = sum/(numbers.length);
        System.out.println(average);*/

        int sum = 0;
        for(int i=0; i< numbers.length; i++){
            if(numbers[i]%2 == 0){
                System.out.println("even: "+ numbers[i]);
            }

        }
    }
}