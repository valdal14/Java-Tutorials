package com.valdal14.collectionsconcurrency.blockingqueue;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class OrderConsumer implements Runnable {

    private BlockingQueue<String> queue;

    private Map<Integer, String> items = new HashMap<>();

    public OrderConsumer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            String item = queue.take();
            System.out.println(Thread.currentThread().getName() + " completed the payment for the " + item);
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " generated an exception: " + e.getMessage());
        }
    }
}
