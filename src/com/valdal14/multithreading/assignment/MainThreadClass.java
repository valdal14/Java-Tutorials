package com.valdal14.multithreading.assignment;

// MainThreadClass should print all the numbers from 0 to 10
public class MainThreadClass {

    public static void main(String[] args) throws InterruptedException {

        EvenNumberThread evenNumberThread = new EvenNumberThread();
        OddNumberThread oddNumberThread = new OddNumberThread();

        synchronized (MainThreadClass.class){
            for (int i = 1; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
                Thread.sleep(1000);
            }

            evenNumberThread.setPriority(Thread.MAX_PRIORITY);
            oddNumberThread.setPriority(Thread.MIN_PRIORITY);
            evenNumberThread.start();
            oddNumberThread.start();
        }


    }
}
