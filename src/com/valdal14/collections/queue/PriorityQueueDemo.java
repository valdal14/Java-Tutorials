package com.valdal14.collections.queue;

import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

    public static void main(String[] args) {

        // Using a comparator to  change the sorting order
        Queue<String> priorityQueue = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                Integer s1Length = s.length();
                Integer s2Length = t1.length();
                if(s2Length < s1Length){
                    return -1;
                } else if (s2Length > s1Length) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });

        // add elements
        priorityQueue.add("Valerio");
        priorityQueue.add("Leonor");
        priorityQueue.add("Grazia");
        priorityQueue.add("Domenico");
        priorityQueue.add("Lorenzo");
        priorityQueue.add("Patrizia");

        System.out.println(priorityQueue);
        // [Leonor, Valerio, Grazia, Domenico, Lorenzo, Patrizia]

        // Peek method - Get back but does not remove the head element
        String head = priorityQueue.peek();
        System.out.println("Current Head: " + head);
        // Object element() - Get back but throws
        try {
            String newHead = priorityQueue.element();
            System.out.println("Current Head: " + newHead);
        } catch (NoSuchElementException e){
            System.out.println("NoSuchElementException : " + e.getMessage());
        }

        // Object poll() removes and returns the head element
        String removeHead = priorityQueue.poll();
        System.out.println("Current Head: " + removeHead);
        // Current Head: Domenico
        System.out.println(priorityQueue);
        // [Patrizia, Valerio, Grazia, Leonor, Lorenzo]

        // Object remove() removes the element but throws
        try {
            boolean removed = priorityQueue.remove("Lorenzo");
            System.out.println("Object removed: " + removed);
            // Object removed: true
        } catch (NoSuchElementException e){
            System.out.println("NoSuchElementException : " + e.getMessage());
        }

        System.out.println(priorityQueue);
        // [Patrizia, Valerio, Grazia, Leonor]

        // boolean offer(Object o)  add the element to the queue
        priorityQueue.offer("Grazietta");
        System.out.println(priorityQueue);
        // [Grazietta, Patrizia, Grazia, Leonor, Valerio]
    }
}
