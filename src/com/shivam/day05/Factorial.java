package com.shivam.day05;

public class Factorial {
    public static void main(String[] args){
        int res = factorial(5);
        System.out.print(res);
    }

    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }

        /*return n * factorial(n-1);*/
        int fact = 1;
        for(int i=n; i>0; i--){
            fact = fact * i;
        }
        return fact;
    }
}
