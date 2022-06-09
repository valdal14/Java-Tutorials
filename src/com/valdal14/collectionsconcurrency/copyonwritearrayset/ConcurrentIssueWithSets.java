package com.valdal14.collectionsconcurrency.copyonwritearrayset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class ConcurrentIssueWithSets {

    private static Set<Integer> set = new HashSet<>();

    public static void main(String[] args) throws InterruptedException {

        // Main Thread adding
        ConcurrentIssueWithSets.addIntegerToSet(ConcurrentIssueWithSets.set, Thread.currentThread().getName());

        // New Thread reading
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                ConcurrentIssueWithSets.printIntegerFromList(Thread.currentThread().getName(), ConcurrentIssueWithSets.set);
            }
        });

        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();

        // New Thread adding
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    ConcurrentIssueWithSets.addIntegerToSet(ConcurrentIssueWithSets.set, Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    System.out.println("InterruptedException : " + e.getMessage());
                }
            }
        });

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.start();

        // wait to to print the list
        t2.join();



        System.out.println(ConcurrentIssueWithSets.set);
    }

    /**
     * Add a new Integer to the set
     * @param set
     */
    private static void addIntegerToSet(Set<Integer> set, String threadName) throws InterruptedException {
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            Integer num = rand.nextInt(200);
            System.out.println(threadName + " is adding a new integer to the set: " + num);
            set.add(num);
            Thread.sleep(100);
        }
    }

    /**
     * Read Integers from the set
     * @param set
     */
    private static void printIntegerFromList(String currentThrad, Set<Integer> set){
        Iterator iterator = set.iterator();

        while (iterator.hasNext()){
            System.out.printf(currentThrad + " is reading number: " + iterator.next() + " from the set \n");
        }
    }
}
