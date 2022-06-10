package com.valdal14.java8functional.expressrunnable;

public class ExpressRunnable {

    public static void main(String[] args) {

//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10; i++) {
//                    System.out.println(Thread.currentThread().getName() + " counting " + i);
//                }
//            }
//        };

        // Re-writing to run method in a lambda way
        Runnable r = ()-> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " counting " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println("Exception: " + e.getMessage());
                }
            }
        };

        r.run();

        // Let's see by passing it in a new Thread
        Thread t = new Thread(r);
        t.start();
    }
}
