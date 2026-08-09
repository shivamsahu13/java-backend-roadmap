package com.shivam.day03;

public class SecondLargest {
    public static void main(String[] args) {

        int[] numbers = {25, 10, 45, 5, 80, 30};
        int largestnumber = Integer.MIN_VALUE;
        int Secondlargestnumber = Integer.MIN_VALUE;
        for(int i=0; i< numbers.length; i++){
            if(numbers[i] > largestnumber){
                Secondlargestnumber = largestnumber;
                largestnumber = numbers[i];
            }else if(numbers[i] > Secondlargestnumber && numbers[i] != largestnumber){
                Secondlargestnumber = numbers[i];
            }

        }
        System.out.println(Secondlargestnumber);
    }
}
