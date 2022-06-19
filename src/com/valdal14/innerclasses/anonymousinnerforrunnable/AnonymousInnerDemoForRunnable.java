package com.valdal14.innerclasses.anonymousinnerforrunnable;

public class AnonymousInnerDemoForRunnable {

    public static void main(String[] args) {

        // anonymous inner class for the Runnable interface
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        });

        t.start();
    }
}
