package com.shivam.day05;

public class Maximum {
    public static void main(String[] args){
        System.out.println(findMaximum(10, 50, 30));
    }

    public static int findMaximum(int a, int b, int c){
        int max = a;

        if(b > max){
            max = b;
        }

        if(c > max){
            max = c;
        }

        return max;
    }
}
