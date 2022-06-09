package com.valdal14.multithreading.runnable;

public class CheckProcessor implements Runnable{
    @Override
    public void run() {
        System.out.println("Processed the checks");
    }

    public static void main(String[] args) {
        CheckProcessor cp = new CheckProcessor();
        // In the runnable interface we do not have the start() method.
        Thread t1 = new Thread(cp);
        t1.start();

        // Or we can do it like so
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Starting new check process");
            }
        });
        t2.setPriority(Thread.MAX_PRIORITY);
        t2.start();
    }
}
