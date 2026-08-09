package com.shivam.day04;

public class ReverseString {
    public static void main(String[] args){

        String name = "hello";
        for(int i=name.length()-1; i >= 0; i--){
            System.out.println(name.charAt(i));
        }

    }
}
