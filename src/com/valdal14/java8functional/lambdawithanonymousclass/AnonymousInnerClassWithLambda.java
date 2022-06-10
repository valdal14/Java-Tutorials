package com.valdal14.java8functional.lambdawithanonymousclass;

public class AnonymousInnerClassWithLambda {

    public static void main(String[] args) {

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 10 ; i++) {
                    System.out.println(Thread.currentThread().getName() + " counting: " + i);
                }
            }
        });

        // Using lambda
        Thread t1 = new Thread(()-> {
            for (int i = 0; i <= 10 ; i++) {
                System.out.println(Thread.currentThread().getName() + " counting: " + i);
            }
        });

        t.start();
        t1.start();

        for (int i = 0; i <= 10 ; i++) {
            System.out.println(Thread.currentThread().getName() + " counting: " + i);
        }
    }
}
