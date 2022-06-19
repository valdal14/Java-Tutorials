package com.valdal14.multithreading.assignment;

// EvenNumberThread number should only print even numbers
public class EvenNumberThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            if(i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
