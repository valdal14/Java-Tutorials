package com.valdal14.multithreading.interrupt;

public class InterruptDemo {

    public static void main(String[] args) throws InterruptedException {

        InterruptClass t = new InterruptClass();
        Thread newThread = t.executeThread();
        newThread.start();


        // Interrupt the thread
        newThread.interrupt();
        System.out.println("End of the main method");
    }
}
