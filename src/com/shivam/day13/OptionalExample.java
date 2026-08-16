package com.shivam.day13;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args){
        //String name = null;
        String name = "Shivam";
        Optional<String> optionalName = Optional.ofNullable(name);
       /* if (optionalName.isPresent()) {
            System.out.println(optionalName.get());
        }*/
        //String result = optionalName.orElse(getDefaultName());
        String result = optionalName.orElseGet(() -> getDefaultName());

        System.out.println(result);

        optionalName.ifPresent(nameval->System.out.println(nameval));
        optionalName.ifPresent(System.out::println);

        Optional<Integer> length = optionalName.map(String::length);

        System.out.println(length);
    }

    public static String getDefaultName() {
        System.out.println("Default method called");
        return "Guest";
    }
}
