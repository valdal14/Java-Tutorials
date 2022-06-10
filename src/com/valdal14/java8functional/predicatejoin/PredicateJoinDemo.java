package com.valdal14.java8functional.predicatejoin;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateJoinDemo {

    public static void main(String[] args) {

        List<Integer> httpResponses = new ArrayList<>();
        httpResponses.add(200);
        httpResponses.add(201);
        httpResponses.add(204);
        httpResponses.add(400);
        httpResponses.add(401);
        httpResponses.add(404);
        httpResponses.add(500);

        // Predicate to filter only success http responses
        Predicate<Integer> p = n -> n >= 200 && n <= 203;

        // Define a second predicate
        Predicate<Integer> p1 = n -> n % 2 == 0;

        // Testing the predicate
        PredicateJoinDemo.httpResponseCodes(httpResponses, p);

        System.out.println("--- Checking for even httpResponses ---");
        // Checking for httpResponse code
        PredicateJoinDemo.httpResponseCodes(httpResponses, p1);

        // Now we can use the negate() method to display the opposite
        System.out.println("--- negate() ---");
        PredicateJoinDemo.httpResponseCodes(httpResponses, p.negate());

        // Now we use the and() operator to join a predicate
        System.out.println("--- and() ---");
        PredicateJoinDemo.httpResponseCodes(httpResponses, p.and(p1));

        // Now we use the or() operator to join a predicate
        System.out.println("--- or() ---");
        PredicateJoinDemo.httpResponseCodes(httpResponses, p.or(p1));
    }

    private static void httpResponseCodes(List<Integer> list, Predicate<Integer> p){
        for (Integer n : list) {
            System.out.println("Response code: " + n + " is valid: " + p.test(n));
        }
    }
}
