package com.valdal14.collections.iterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class IteratorDemo {

    public static void main(String[] args) {

        Random rand = new Random();

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < 20; i++) {
            set.add(rand.nextInt(20));
        }

        System.out.println("Set: " + set);

        // using an Iterator object
        // As we can see we have two method available
        Iterator<Integer> iterator = new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Integer next() {
                return null;
            }
        };

        Iterator<Integer> it = set.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
            // using the iterator we can also remove the values
            it.remove();
        }
        System.out.println("Set: " + set);
    }
}
