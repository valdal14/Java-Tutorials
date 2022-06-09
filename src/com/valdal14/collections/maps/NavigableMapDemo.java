package com.valdal14.collections.maps;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapDemo {

    private static final char[] ALPHABET = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    public static void main(String[] args) {


        NavigableMap<String, String> treeNavigableMap = new TreeMap<>();

        // add elements
        int counter = 0;
        for (char c: NavigableMapDemo.ALPHABET) {
            treeNavigableMap.put(String.valueOf(c), String.valueOf(counter));
            counter += 1;
        }

        System.out.println(treeNavigableMap);

        // floorKey = takes an object and returns the highest which is <= then the object we pass in
        System.out.println("floorKey(c) : " + treeNavigableMap.floorEntry("c")); // c=2
        // lowerKey = takes an object and returns the highest key which is < then the object we pass in
        System.out.println("lowerKey(c) : " + treeNavigableMap.lowerKey("c")); // b
        // ceilingKey = takes an object and returns the lowest keys which is >= then the object we pass in
        System.out.println("ceilingKey(c) : " + treeNavigableMap.ceilingKey("c")); // c
        // higherKey = takes an object and returns the lowest key which is >= then the object we pass in
        System.out.println("higherKey(c) : " + treeNavigableMap.higherKey("c")); // d
        // pollFirstEntry = Returns and removes the first element in the Map
        System.out.println("pollFirstEntry() : " + treeNavigableMap.pollFirstEntry()); // a=0
        // pollLastEntry = Returns and removes the last element in the Map
        System.out.println("pollLastEntry() : " + treeNavigableMap.pollLastEntry()); // z=25
        // descendingMap = will return Map in desc order
        System.out.println(treeNavigableMap.descendingMap());
        // {y=24, x=23, w=22, v=21, u=20, t=19, s=18, r=17, q=16, p=15, o=14, n=13, m=12, l=11, k=10, j=9, i=8, h=7, g=6, f=5, e=4, d=3, c=2, b=1}

    }
}
