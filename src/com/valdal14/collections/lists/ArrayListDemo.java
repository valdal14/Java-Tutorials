package com.valdal14.collections.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ArrayListDemo {

    public static void main(String[] args) {

        // Array list
        ArrayList list = new ArrayList(15);
        list.add(10); // converts to wrapper types
        list.add(20);
        list.add("String");
        list.add(true);

        // We can also create a specialized ArrayList
        ArrayList<String> strList = new ArrayList<>();
        strList.add("Ciao");
        strList.add("Hello");
        strList.add("Hi");

        // Replacing objects
        strList.set(0, ":)");

        for (String s: strList) {
            System.out.println(s);
        }

        // We can also use runtime polymorphism to create an ArrayList from a List
        // The methods of the child ArrayList class will be avaiable to us
        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);

        // replace a number
        intList.set(0, 14);

        // insert at specific index (slow operation)
        intList.add(1, 10);

        System.out.println(intList);

        // Add all
        List<Integer> addNewList = new ArrayList<>();
        addNewList.add(1);
        addNewList.add(2);
        addNewList.add(3);
        addNewList.add(4);
        addNewList.add(5);

        intList.addAll(addNewList);
        System.out.println(intList);

        // contains
        boolean containsFour = intList.contains(4);
        System.out.println("Contains the number 4: " + containsFour);

        // size of a List
        System.out.println(intList.size());

        // remove an element by index
        intList.remove(0);
        System.out.println(intList); // [10, 20, 1, 2, 3, 4, 5]

        // Remove if with a filter predicate
        intList.removeIf(n -> n >= 20);
        System.out.println(intList);  // [10, 1, 2, 3, 4, 5]

        // Streams
        System.out.println("--- Streams ---");
        intList.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        System.out.println("--- Return a List from a Streams ---");
        List<Integer> filteredList = intList.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(filteredList);

    }
}
