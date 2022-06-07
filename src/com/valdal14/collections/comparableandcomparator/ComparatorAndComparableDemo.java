package com.valdal14.collections.comparableandcomparator;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Let's also use the Comparable Interface to change the sorting based on their length
 */

public class ComparatorAndComparableDemo {

    public static void main(String[] args) {

        // Implement the comparator with the anonymous implementation
        Set<String> treeSet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                // Strings already provide the compareTo implementation
                return s.compareTo(t1);
            }
        });

        treeSet.add("ghi");
        treeSet.add("pqr");
        treeSet.add("abc");
        treeSet.add("def");

        System.out.println(treeSet);

        // Change the sorting
        Set<String> treeSetTwo = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                // Strings already provide the compareTo implementation
                Integer s1l = s.length();
                Integer s2l = t1.length();
                return s2l.compareTo(s1l);
            }
        });

        treeSetTwo.add("ghi");
        treeSetTwo.add("pqrs");
        treeSetTwo.add("tuwyvz");
        treeSetTwo.add("ab");
        treeSetTwo.add("def");
        treeSetTwo.add("lmno");

        System.out.println(treeSetTwo);

    }
}
