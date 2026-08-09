package com.shivam.day02;

import java.util.Arrays;

public class Loops {

    public static void main(String[] args){
        /*for(int i=1; i<=100; i++){
            System.out.println("num: "+i);
        }*/
        /*int factorial = factorial(5);
        System.out.println("Factorial:" + factorial);*/
        int[] result = fabonacci(100);
        System.out.println(Arrays.toString(result));
    }

    //factorial of 5 is 5*4*3*2*1 = 120
    public static int factorial(int n){
        int fact = 1;
        for(int i=n; i>0; i--){
            fact = fact*i;
        }

        return fact;
    }
    //fabonacci series is 0,1,1,2,3,5,8,12....
    public static int[] fabonacci(int n){
        if(n <= 0) return new int[0];
        int a = 0;
        int b = 1;
        int[] fab = new int[n];
        for(int i=0; i<n; i++){
            fab[i] = a;
            int c = a+b;
            a = b;
            b = c;
        }

        return fab;
    }

}
