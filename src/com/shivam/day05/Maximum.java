package com.shivam.day05;

public class Maximum {
    public static void main(String[] args){
        System.out.println(findMaximum(10, 50, 30));
    }

    public static int findMaximum(int a, int b, int c){
        if(a > b && a > c){
            return a;
        }else if(b > a && b > c){
            return b;
        }else{
            return c;
        }
    }
}
