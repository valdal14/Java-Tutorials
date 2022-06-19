package com.valdal14.collectionsconcurrency.concurrenthashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

// The thread 2 cannot write becuase of a lock placed by thread one

public class ConcurrentHashMapDemo {

    private static Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) throws InterruptedException {

        // Main thread writing into the map
        ConcurrentHashMapDemo.addElementToMap(Thread.currentThread().getName(), ConcurrentHashMapDemo.map);

        // New Thread Writing into the map
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                ConcurrentHashMapDemo.addElementToMap(Thread.currentThread().getName(), ConcurrentHashMapDemo.map);
            }
        });

        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();

        // New Thread reading the map
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                ConcurrentHashMapDemo.readElementFromMap(Thread.currentThread().getName(), ConcurrentHashMapDemo.map);
            }
        });

        t2.setPriority(Thread.MAX_PRIORITY);
        t2.start();
        // waiting before printing the results
        t1.join();

        System.out.println(ConcurrentHashMapDemo.map);
    }

    /**
     * Add elements into the map
     * @param thredName
     * @param map
     */
    private static void addElementToMap(String thredName, Map<Integer, Integer> map){
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            Integer num = rand.nextInt(200);
            System.out.println(thredName + " is adding a new number: " + num + " to the map");
            map.put(i, num);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(thredName + " has generated an InterruptedException" + e.getMessage());
            }
        }
    }

    /**
     * Read elements from the map
     * @param thredName
     * @param map
     */
    private static void readElementFromMap(String thredName, Map<Integer, Integer> map){
        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            System.out.println(thredName + " is reading from the map: " + map.get(iterator.next()));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(thredName + " has generated an InterruptedException" + e.getMessage());
            }
        }
    }
}
