package com.valdal14.multithreading.threadsidentity;

public class ThreadsIdentity extends Thread {

    public static void main(String[] args) throws InterruptedException {

        ThreadsIdentity ti = new ThreadsIdentity();
        ti.start();

        Thread tm = Thread.currentThread();
        String tmName = tm.getName();
        System.out.println("This is the main thread named: " + tmName);
    }

    @Override
    public void run() {
        Thread t1 = Thread.currentThread();
        // we can also set the name of a thread
        t1.setName("Second Thread");
        String t1name = t1.getName();
        System.out.println("This is the thread named: " + t1name);
    }
}
