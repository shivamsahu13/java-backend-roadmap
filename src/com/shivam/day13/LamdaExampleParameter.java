package com.shivam.day13;

@FunctionalInterface
interface Calculator {
    int add(int a, int b);
}
public class LamdaExampleParameter {

    public static void main(String[] args){
        Calculator calculator = (int a, int b) -> a + b;
        System.out.println(calculator.add(10,20));
    }

}
