package com.shivam.day12;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args){

        ArrayList<Integer> number = new ArrayList<>();
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);

        number.add(2, 25);
        //System.out.println(number);
        number.set(4, 45);
        System.out.println(number);

        //number.remove(2);
        number.remove(Integer.valueOf(25));
        System.out.println(number);
        System.out.println(number.contains(45));
        System.out.println(number.size());

        for(int i=0; i<number.size(); i++){
            System.out.println(number.get(i));
        }
        System.out.println();
        for(Integer num : number){
            System.out.println(num);
        }

    }
}
