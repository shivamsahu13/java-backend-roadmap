package com.shivam.day14;

public class CustomExceptionExample {

    public static void ageCheck(int age) throws InvalidAgeException{
        if(age < 20){
            throw new InvalidAgeException("Age must be 18 or above");
        }

        System.out.println("Eligible");
    }

    public static void main(String[] args){
        try{
            ageCheck(16);
        }catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Program finished");
    }

}
