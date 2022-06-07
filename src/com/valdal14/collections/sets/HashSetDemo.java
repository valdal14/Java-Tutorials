package com.valdal14.collections.sets;

import java.util.*;

public class HashSetDemo {

    public static void main(String[] args) {

        Random rand = new Random();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            list.add(rand.nextInt(5));
        }

        System.out.println("--- LIST ----");
        list.stream()
                .forEach(System.out::println); // we have duplicated in our list

        // Let's now see how the set behaves with duplicated values
        Set<Integer> set = new HashSet<>(list);

        System.out.println("--- SET ----");
        set.stream()
                .forEach(System.out::println); // we do not have duplicated values in the set

    }
}
