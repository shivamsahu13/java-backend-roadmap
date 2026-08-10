package com.shivam.day05;

public class EvenOdd {
    public static void main(String[] args){
        System.out.println(isEven(15));
    }

    public static boolean isEven(int a){
        if(a%2==0){
            return true;
        }else{
            return false;
        }
    }
}
