package com.valdal14.multithreading.threadpriority;

public class ThreadPriority extends Thread {

    public static void main(String[] args) {
        ThreadPriority tp = new ThreadPriority();
        tp.setPriority(Thread.MAX_PRIORITY);
        tp.start();

        ThreadPriority tp1 = new ThreadPriority();
        tp1.setPriority(Thread.MIN_PRIORITY);
        tp1.setName("Second Thread");
        tp1.start();


        for(int j = 0; j < 5; j++){
            System.out.print("j: " + j + "\t");
        }

    }

    @Override
    public void run() {

        System.out.println("Thread name: " + Thread.currentThread().getName());
        for(int i = 0; i < 8; i++){
            System.out.print("i: " + i + "\t");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
