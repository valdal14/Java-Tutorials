package com.valdal14.collections.comparableandcomparator;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class SortingObjects {

    public static void main(String[] args) {

        Map<String, Object> treeMap = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return t1.compareTo(s);
            }
        });

        treeMap.put("A", new InnerOne());
        treeMap.put("C", new InnerTwo());
        treeMap.put("B", new InnerOne());
        treeMap.put("F", new InnerTwo());
        treeMap.put("E", new InnerOne());
        treeMap.put("D", new InnerTwo());

        for (Map.Entry<String, Object> obj : treeMap.entrySet()) {
            System.out.println(obj.getKey());
        }

    }

    static class InnerOne implements Comparable<Object> {
        @Override
        public int compareTo(Object o) {
            InnerTwo innerTwo = (InnerTwo) o;
            return this.compareTo(innerTwo);
        }
    }

    static class InnerTwo implements Comparable<Object> {
        @Override
        public int compareTo(Object o) {
            InnerOne innerOne = (InnerOne) o;
            return this.compareTo(innerOne);
        }
    }
}
