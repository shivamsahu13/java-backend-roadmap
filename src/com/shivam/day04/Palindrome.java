package com.shivam.day04;

public class Palindrome {
    public static void main(String[] args){
        String name = "hello"; //"madam";
        boolean is_palindrme = false;
        for(int i=0; i<name.length()-1; i++){
            if(name.charAt(i) == name.charAt((name.length()-1) - i)){
                is_palindrme = true;
            }else{
                is_palindrme = false;
            }
        }
        if(is_palindrme){
            System.out.println("String is palendrome");
        }else{
            System.out.println("String is not palendrome");
        }

    }
}
