package com.valdal14.Java11Features.OptionalsAndisEmpty;

import java.util.Optional;

public class OptionalsAndisEmpty {

    public static void main(String[] args) {

        // Empty Optional
        Optional<String> str = Optional.empty();
        // Before Java 11 we have to do...
        if(str.isPresent()){
            System.out.println("The Optional value is empty");
        } else {
            System.out.println("The Optional values is: " + str);
        }

        // In Java 11 we can use the new isEmpty method
        System.out.println(str.isEmpty());

        // Create an Optional with a value
        Optional<Integer> op = Optional.of(123);
        System.out.println(op.isEmpty());

    }
}
