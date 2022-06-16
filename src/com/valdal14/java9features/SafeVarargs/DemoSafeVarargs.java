package com.valdal14.java9features.SafeVarargs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoSafeVarargs {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("1,2,3");
        List<String> list1 = Arrays.asList("1,2,3");
        DemoSafeVarargs.m1(list, list1); // this will get ClassCastException
    }

    // List<String>...l internally is represented like a List of String Arrays: List<String>[]
    @SafeVarargs
    private static void m1(List<String>...l){
        String value = (String) l[0].get(0);
        System.out.println(value);
    }
}
