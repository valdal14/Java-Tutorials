package com.valdal14.java8functional.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateUseCase {

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

        // Testing the predicate
        PredicateUseCase.httpResponseCodes(httpResponses, p);

    }

    private static void httpResponseCodes(List<Integer> list, Predicate<Integer> p){
        for (Integer n : list) {
            System.out.println("Response code: " + n + " is valid: " + p.test(n));
        }
    }

}
