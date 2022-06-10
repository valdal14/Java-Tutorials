package com.valdal14.java8functional.streams.quickdemo;

import java.util.*;

public class StreamsDemo {

    private Set<Runnable> set;

    public StreamsDemo(Set<Runnable> set) {
        this.set = set;
    }

    public static void main(String[] args) throws InterruptedException {

        // Create a set of threads
        Set<Runnable> newSet = new HashSet<>();

        // add 5 Runnables to the list
        for (int i = 0; i < 5; i++) {
            newSet.add(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 10; i++) {
                        System.out.println(Thread.currentThread().getName() + " counting: " + i);
                        try {
                            Random rand = new Random();
                            Thread.sleep(rand.nextInt(10000));
                        } catch (InterruptedException e) {
                            System.out.println("Exception : " + e.getMessage());
                        }
                    }
                }
            });
        }

        // instance of the StreamsDemo class
        StreamsDemo streamsDemo = new StreamsDemo(newSet);

        // Mapping to a constructor
        Printable<Runnable> printable = StreamsDemo::new;
        printable.print(streamsDemo.set);

        // We can see all the runnable stored
        streamsDemo.set.stream().forEach(System.out::println);

        // Return a new List of Runnables
        List<Runnable> newList = streamsDemo.set.stream().toList();

        for (Runnable r: newList) {
            Thread t = new Thread(r);
            t.start();
        }

    }
}
