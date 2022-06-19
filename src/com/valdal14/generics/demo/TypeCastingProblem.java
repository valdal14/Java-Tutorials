package com.valdal14.generics.demo;

import java.util.ArrayList;
import java.util.List;

public class TypeCastingProblem {

    public static void main(String[] args) {

        // Array are strict about the data type we can store
        // At compile time we already see the error trying to
        // add an int to an Array of Strings
        String[] arr = new String[10];
        arr[0] = "John";
        arr[1] = "Val";
        // arr[2] = 123; Type Casting issue

        // On the other hand collections are not strict in that regards
        List list = new ArrayList<>();
        list.add("Hello");
        list.add("Ciao");
        list.add(true);
        list.add(14.5);

        // runtime error
        String name = (String) list.get(0); // ok

        try {
            // this is a double but no compile time error is shows
            String name2 = (String) list.get(3);
            // The above will throw a new ClassCastException
        } catch (ClassCastException e){
            System.out.println("ClassCastException: " + e.getMessage());
        } finally {
            System.out.println("This can be solved with Generics, see below....");
        }


        // Using a Generics list will see the issue at compile time
        System.out.println("--- USING GENERICS ---");
        List<String> l = new ArrayList<>();
        l.add("Hello");
        l.add("Ciao");
        // l.add(true); at compile time we can already see the issue
    }
}
