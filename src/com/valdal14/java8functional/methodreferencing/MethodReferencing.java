package com.valdal14.java8functional.methodreferencing;

import java.util.Scanner;
import java.util.function.BiConsumer;

public class MethodReferencing {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first integers: ");
        int numOne = Integer.parseInt(sc.next());
        System.out.print("Enter the second integers: ");
        int numTwo = Integer.parseInt(sc.next());
        Summable s = MethodReferencing::sum;
        System.out.println(s.sum(numOne, numTwo));

        // Using Method Reference to map the functional interface Runnable
        Runnable r = MethodReferencing::MyRun;
        r.run();

        Thread t = new Thread(r);
        t.start();
        t.join();

        // Referencing an instance method
        System.out.println("--- Referencing an instance method ---");
        MethodReferencing mr = new MethodReferencing();
        Summable instanceMethod = mr::instanceMethod;
        Integer s2 = instanceMethod.sum(10,4);
        System.out.println(s2);

    }

    private Integer instanceMethod(int a, int b){
        return a + b;
    }
    private static Integer sum(Integer a, Integer b){
        Summable i = (numOne, numTwo) -> numOne + numTwo;
        return i.sum(a, b);
    }

    private static void MyRun(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
