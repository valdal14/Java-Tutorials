package com.valdal14.collections.sets;

import java.util.Set;
import java.util.TreeSet;

public class StringTreeSet {

    public static void main(String[] args) {

        Set<String> set = new TreeSet<>();
        set.add("Hello");
        set.add("Hi");
        set.add("Olá");
        set.add("Привет");
        set.add("Hallo");
        set.add("Helo");
        set.add("Ciao");

        System.out.println("TreeSet: " + set); // sorted
        // TreeSet: [Ciao, Hallo, Hello, Helo, Hi, Olá, Привет]

        // Now let's see what happens if we use a String Buffer
        Set<StringBuffer> treeSetStringBuffer = new TreeSet<>();

        treeSetStringBuffer.add(new StringBuffer("Hello"));
        treeSetStringBuffer.add(new StringBuffer("hi"));
        treeSetStringBuffer.add(new StringBuffer("Olá"));
        treeSetStringBuffer.add(new StringBuffer("Привет"));
        treeSetStringBuffer.add(new StringBuffer("Hallo"));
        treeSetStringBuffer.add(new StringBuffer("Helo"));
        treeSetStringBuffer.add(new StringBuffer("Ciao"));

        System.out.println("TreeSet od StringBuffer: " + treeSetStringBuffer); // sorted
        // TreeSet od StringBuffer: [Ciao, Hallo, Hello, Helo, Olá, hi, Привет]

    }
}
