package com.valdal14.java8functional.lambda;

public class ImplementSummableInterfaceDemo {

    public static void main(String[] args) {

        SummableInterface sum = (a, b) -> a + b;
        Integer total = sum.calculateAddition(7,7);
        System.out.println("The total is: " + total);
    }
}
