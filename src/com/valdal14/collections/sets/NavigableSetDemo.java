package com.valdal14.collections.sets;

import java.util.TreeSet;

public class NavigableSetDemo {

    public static void main(String[] args) {

        TreeSet<Integer> navigableSet = new TreeSet<>();

        for (int i = 0; i < 5; i++) {
            navigableSet.add(i);
        }

        System.out.println(navigableSet);

        // ceiling(e) = takes an object and returns the lowest which is >= then the object we pass in
        System.out.println("ceiling(3) : " + navigableSet.ceiling(3)); // 3
        // floor(e) = takes an object and returns the highest which is <= then the object we pass in
        System.out.println("floor(3) : " + navigableSet.floor(3)); // 3
        // lower(e) = takes an object and returns the highest which is < then the object we pass in
        System.out.println("lower(3) : " + navigableSet.lower(3)); // 2
        //  higher(e) = takes an object and returns the lowest which is >= then the object we pass in
        System.out.println("higher(3) : " + navigableSet.higher(3)); // 4
        // pollFirst() = Returns and removes the first element in the set
        Integer first = navigableSet.pollFirst();
        System.out.println("pollFirst() : " + first); // 0
        // pollLast() =  pollFirst() = Returns and removes the first element in the set
        Integer last = navigableSet.pollLast();
        System.out.println("pollLast() : " + last); // 4
        System.out.println(navigableSet); // [1, 2, 3]
        // descendingSet() = will return set in desc order
        System.out.println(navigableSet.descendingSet()); // [3, 2, 1]
    }
}
