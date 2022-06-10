package com.valdal14.java8functional.predicate;

import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {

        // Creating a predicate using the Functional Interface Predicate
        Predicate<Integer> predicate = (Integer num) -> num >= 20;
        System.out.println(predicate.test(12));

        // passing it as method argument
        PredicateDemo.checkReturnCode(predicate, 20);
    }

    private static void checkReturnCode(Predicate<Integer> predicate, Integer value){
        System.out.println("The return code is greater than 20? - result: " + predicate.test(value));
    }
}
