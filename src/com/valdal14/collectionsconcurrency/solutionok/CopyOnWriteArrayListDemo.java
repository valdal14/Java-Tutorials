package com.valdal14.collectionsconcurrency.solutionok;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {

    public static void main(String[] args) throws InterruptedException {

        CopyOnWriteArrayList<String> courses = new CopyOnWriteArrayList<>();
        courses.add("Java");
        courses.add("PL/SQL");
        courses.add("Python");
        courses.add("JS");
        courses.add("React");

        Iterator<String> iterator = courses.iterator();

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

        // wait to verify what we have into the list
        t.join();

        System.out.println(courses);
        // [PL/SQL, Python, JS, React, Parallel Programming, Concurrent Programming, Django, AWS, MODE]
    }
}
