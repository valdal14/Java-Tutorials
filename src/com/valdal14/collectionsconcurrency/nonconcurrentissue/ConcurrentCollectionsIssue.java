package com.valdal14.collectionsconcurrency.nonconcurrentissue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Running this we will probably get a new ConcurrentModificationException

public class ConcurrentCollectionsIssue {

    public static void main(String[] args) throws InterruptedException {
        List<String> courses = new ArrayList<>();
        courses.add("Java");
        courses.add("PL/SQL");
        courses.add("Python");
        courses.add("JS");
        courses.add("React");

        Iterator<String> iterator = courses.iterator();

        // create a new thread
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Adding from another Thread while possible reading locking");
                courses.add("Parallel Programming");
                courses.add("Concurrent Programming");
                courses.add("Django");
                courses.add("AWS");
                courses.add("MODE");
                courses.remove("Java");
            }
        });

        t.setPriority(Thread.MAX_PRIORITY);
        t.start();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
            Thread.sleep(100);
        }
    }
}
