package com.valdal14.Java12Features.CollectorsAPI;

import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsAPIDemo {

    public static void main(String[] args) {

        Predicate<Integer> predicate = x -> Integer.parseInt(x.toString()) > 10;
        Result res = Stream.of(5,10,8,20,7,15,18).collect(Collectors.teeing(Collectors.counting(),
                Collectors.filtering(predicate, Collectors.toList()), Result::new));
        System.out.println(res);
    }
}
