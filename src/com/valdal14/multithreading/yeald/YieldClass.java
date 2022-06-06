package com.valdal14.multithreading.yeald;

public class YieldClass {
    public static Thread t = new Thread(new Runnable() {
        @Override
        public void run() {
            for(int i = 1; i <= 10; i++){
                System.out.println("Child Thread");
                Thread.yield();
            }
        }
    });
}
