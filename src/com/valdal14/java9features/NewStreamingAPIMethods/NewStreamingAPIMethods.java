package com.valdal14.java9features.NewStreamingAPIMethods;

import java.net.Inet4Address;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NewStreamingAPIMethods {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        // New methods in Streaming APIs
        Predicate<Integer> predicate = integer -> integer % 2 == 0;
        list.stream().filter(predicate).forEach(System.out::println);
        // takeWhile() ----------------------------------------------------
        System.out.println("--- takeWhile() ---");
        // It will take all the elements that mathes the predicate condition
        // and it will stop as soon as it finds an element that does not
        // match that condition
        list.stream().takeWhile(x-> x % 2 != 0).forEach(System.out::println);
        // it will print just 1 since 2 is even and does not match the condition

        // dropWhile() ---------------------------------------------------------
        System.out.println("--- dropWhile() ---");
        list.stream().dropWhile(x-> x % 2 != 0).forEach(System.out::println);
        // opposite of takeWhile it will print everything after the condition is
        // no longer matches no matter the result of the rest

        // ofNullable() --------------------------------------------------------
        System.out.println("--- ofNullable() ---");
        // Type and Return value
        Function<Integer, Stream<Integer>> function = Stream::ofNullable;
        // It does a null check of us and skip if it found one
        list.stream().flatMap(function).forEach(System.out::println);
    }
}
