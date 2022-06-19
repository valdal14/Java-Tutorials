package com.valdal14.Java12Features.StringAPIFeatures;

import java.util.function.Function;

public class StringAPIFeatures {

    public static void main(String[] args) {

        String s = "I'am a new String";
        // Indentation
        System.out.println(s.indent(5));
        // Negative Indentation
        System.out.println(s.indent(-4));

        String str = "10";
        Function<String, Integer> myFunc = a -> Integer.parseInt(str) * 2;
        Integer res = str.transform(myFunc);
        System.out.println(res);
    }
}
