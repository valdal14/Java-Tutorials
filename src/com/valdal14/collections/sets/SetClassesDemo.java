package com.valdal14.collections.sets;

import java.util.*;
import java.util.stream.Collectors;

public class SetClassesDemo {

    public static void main(String[] args) {
        Random rand = new Random();

        // HashSet --------------------------------------------
        System.out.println("--- HashSet ---");

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i <= 5; i++) {
            int num = rand.nextInt(100);
            System.out.println(num);
            set.add(num);
        }

        System.out.println("HashSet: " + set);

        /**
         * Duplicates are not present but order of
         * generation is not maintained in the HashSet
         *
         * 63
         * 69
         * 85
         * 64
         * 19
         * 43
         * HashSet: [64, 19, 69, 85, 43, 63]
         */

        // ----------------------------------------------


        // LinkedHashSet ----------------------------------
        System.out.println("--- LinkedHashSet ---");

        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        for (int i = 0; i <= 5; i++) {
            int num = rand.nextInt(100);
            System.out.println(num);
            linkedHashSet.add(num);
        }

        System.out.println("LinkedHashSet: " + linkedHashSet);

        /**
         * LinkedHashSet duplicates are gone
         * but maintains the order
         *
         * 27
         * 25
         * 6
         * 39
         * 98
         * 25
         * LinkedHashSet: [27, 25, 6, 39, 98]
         */
        // ----------------------------------------------

        // TreeSet -------------------------------------
        System.out.println("--- TreeSet ---");
        Set<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i <= 5; i++) {
            int num = rand.nextInt(100);
            System.out.println(num);
            treeSet.add(num);
        }

        System.out.println("TreeSet: " + treeSet);

        /**
         *  TreeSet order is not maintained and
         *  duplicated are not stored and it is sorted
         * 42
         * 75
         * 2
         * 15
         * 31
         * 82
         * TreeSet: [2, 15, 31, 42, 75, 82]
         */
        // ----------------------------------------------

    }
}
