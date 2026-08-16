package com.shivam.day14;

public class ExceptionExample {

    public static void main(String[] args) throws Exception{
        /*int a = 10;
        int b = 0;
        try{
            System.out.println(a / b);
        }catch (ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }*/
        /*try{
            int[] number = {10, 20, 30};
            System.out.println(number[5]);
        }catch (ArithmeticException e){
            System.out.println("Arithmetic error");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index error");
        }finally {
            System.out.println("Program finished");
        }*/
        /*try{
            int age = 15;
            if(age < 18){
                throw new IllegalArgumentException("Age must be 18 or above");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Program finished");*/
        checkAge(15);
    }

    public static void checkAge(int age) throws Exception {

        if (age < 18) {
            throw new Exception("Age must be 18 or above");
        }

        System.out.println("Eligible");
    }
}
