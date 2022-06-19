package com.valdal14.java9features.ImmutableCollections;

import java.util.List;
import java.util.Set;

public class ImmutableCollections {

    public static void main(String[] args) {

        List<String> list = List.of("abc", "xyz", "124");
        // list.add("123"); --> will throw a UnsupportedOperationException
        System.out.println(list);

        Set<String> newSet = Set.of("1", "2", "3");
        // newSet.add("4"); --> will throw a UnsupportedOperationException
        System.out.println(newSet);


    }
}
