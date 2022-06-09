package com.valdal14.multithreading.deadlock;

public class DeadLockDemo implements Runnable {

    FirstResource fr = new FirstResource();
    SecondResource sr = new SecondResource();

    public DeadLockDemo() {
        new Thread(this).start();
        // invoke the SR to produce a DeadLock
        sr.method1(fr);
    }

    public static void main(String[] args) {
        new DeadLockDemo();
    }

    @Override
    public void run() {
        fr.method1(sr);
    }
}
