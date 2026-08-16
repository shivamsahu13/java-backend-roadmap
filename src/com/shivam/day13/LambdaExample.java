package com.shivam.day13;

interface Greeting {
    void sayHello();

}

public class LambdaExample {

    public static void main(String[] args){
        /*Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello Shivam");
            }
        };
        greeting.sayHello();*/

        Greeting greeting = () -> {
            System.out.println("Hello Shivam");
        };
        greeting.sayHello();

    }

}
