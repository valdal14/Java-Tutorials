package com.valdal14.collectionsconcurrency.blockingqueue;

import java.util.*;
import java.util.concurrent.BlockingQueue;

public class OrderProducer implements Runnable{

    // Define a field
    private BlockingQueue<String> queue;

    private Map<Integer, String> items = new HashMap<>();

    public OrderProducer(BlockingQueue<String> queue) {
        this.queue = queue;
        items.put(0, "MacBook Pro");
        items.put(1, "MacBook Air");
        items.put(2, "Mac Pro");
        items.put(3, "Mac Studio");
    }

    @Override
    public void run() {
        try {
            Random rand = new Random();
            Integer key = rand.nextInt(3);
            System.out.println(Thread.currentThread().getName() + " is placing an item in the order " + items.get(key));
            queue.put(items.get(key));
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " generated an exception: " + e.getMessage());
        }
    }
}
