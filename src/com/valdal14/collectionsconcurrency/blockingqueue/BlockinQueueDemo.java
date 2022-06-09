package com.valdal14.collectionsconcurrency.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockinQueueDemo {

    public static void main(String[] args) {
        // Create a Blocking queue
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(1024);
        // Creating the Producer
        OrderProducer producer = new OrderProducer(queue);
        // Creating the Consumer
        OrderConsumer consumer = new OrderConsumer(queue);

        // start multiple threads
        new Thread(producer).start();
        new Thread(producer).start();
        new Thread(producer).start();

        new Thread(consumer).start();
        new Thread(consumer).start();

    }
}
