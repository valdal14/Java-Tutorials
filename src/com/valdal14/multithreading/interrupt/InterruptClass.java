package com.valdal14.multithreading.interrupt;

public class InterruptClass {

    public Thread executeThread(){
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++){
                    System.out.println(Thread.currentThread().getName());
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        System.out.println("Exception " + e.getMessage());
                    }
                }
            }
        });

        return t;
    }

}
