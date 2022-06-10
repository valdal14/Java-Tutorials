package com.valdal14.java8functional.streams.streamsinaction;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class JavaStreamsInAction {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        // Populate a list
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        // We can use a Predicate with the filter method
        // In this case I will be filtering only even number
        Predicate<Integer> predicate = n -> n % 2 == 0;

        // Or we can use a Function Interface to map and get
        // back a new collection. In this case the square of a given number

        // I.E:  Function<String, Integer> fullNameLength = (str)-> str.length();
        Function<Integer, Integer> functionMap = (a) -> a * 2;

        // First part is configuration....
        System.out.println("--- Streams in action ---");

        // FILTER
        System.out.println("--- FILTER ---");
        // Here we use the predicate and then we use the Reference Method to print all even
        list.stream().filter(predicate).forEach(System.out::println);

        // MAP
        System.out.println("--- MAP ---");
        // here we use the Function Interface functionMap to return a new collection
        List<Integer> myNewList = list.stream().map(functionMap).toList();
        myNewList.stream().forEach(System.out::println);

        // Second phase processing
        // Let's use the myNewList to see the other useful method
        System.out.println("--- COUNT ---");
        System.out.println(myNewList.stream().count() + " elements");

        System.out.println("--- REDUCE ---");
        // Method reference
        BinaryOperator<Integer> bo = Integer::sum;
        // or BinaryOperator<Integer> bo = (integer, integer2)-> integer + integer2;
        Integer b = myNewList.stream().reduce(0, bo);
        System.out.println("The sum of all the elements is: " + b);

        System.out.println("--- SORTED ---");
        Random rand = new Random();
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Integer num = rand.nextInt(50);
            l.add(num);
        }

        System.out.println("Unsorted list: " + l);
        List<Integer> collect = l.stream().sorted().toList();
        System.out.println("Sorted list: " + collect);

        // We can also use a comparator and pass it to the sorted() method
        // Let's revert the sorted list
        Comparator<Integer> comparator = (intOne, intTwo)-> intTwo.compareTo(intOne);
        List<Integer> revertedSort = collect.stream().sorted(comparator).toList();
        // print the revertedSort
        System.out.println("Revert Sorted list: " + revertedSort);

        System.out.println("--- MIN ---");
        // Also min and max take a Comparator
        Comparator<Integer> newComp = (intOne, intTwo) -> intOne.compareTo(intTwo);
        Optional<Integer> min = revertedSort.stream().min(newComp);
        System.out.println("The min number in the list is: " + min.get());

        System.out.println("--- MAX ---");
        Optional<Integer> max = revertedSort.stream().max(newComp);
        System.out.println("The min number in the list is: " + max.get());

        // For each
        System.out.println("--- FOR EACH ---");
        revertedSort.stream().filter(n -> n % 2 != 0).forEach(n -> System.out.printf("Odd: %d ", n));

    }

}
