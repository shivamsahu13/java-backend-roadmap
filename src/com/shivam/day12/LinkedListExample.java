package com.shivam.day12;
import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args){

        LinkedList<String> names = new LinkedList<>();
        names.add("Shivam");
        names.add("Amit");
        names.add("Rahul");
        //System.out.println(names);

        names.addFirst("Rohit");
        names.addLast("Vikas");

        System.out.println(names);

        names.removeFirst();
        names.removeLast();
        System.out.println(names);

        System.out.println(names.getFirst());
        System.out.println(names.getLast());

        System.out.println(names);
    }
}
