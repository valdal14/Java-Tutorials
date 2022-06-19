package com.valdal14.collectionsconcurrency.copyonwritearrayset;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class SolutionWithCopyOnWriteArraySet {

    // Replace the HashSet with the new CopyOnWriteArraySet
    private static CopyOnWriteArraySet<Integer> set = new CopyOnWriteArraySet<>();

    public static void main(String[] args) throws InterruptedException {

        // Main Thread adding
        SolutionWithCopyOnWriteArraySet.addIntegerToSet(SolutionWithCopyOnWriteArraySet.set, Thread.currentThread().getName());

        // New Thread reading
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                SolutionWithCopyOnWriteArraySet.printIntegerFromList(Thread.currentThread().getName(), SolutionWithCopyOnWriteArraySet.set);
            }
        });

        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();

        // New Thread adding
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    SolutionWithCopyOnWriteArraySet.addIntegerToSet(SolutionWithCopyOnWriteArraySet.set, Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    System.out.println("InterruptedException : " + e.getMessage());
                }
            }
        });

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.start();

        // wait to to print the list
        t2.join();



        System.out.println(SolutionWithCopyOnWriteArraySet.set);
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
