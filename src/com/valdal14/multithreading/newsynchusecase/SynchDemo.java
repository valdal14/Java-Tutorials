package com.valdal14.multithreading.newsynchusecase;

public class SynchDemo {

    public static void main(String[] args) {

        SynchClass synchClass = new SynchClass();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.printf("%s accessing the synch m1() method \n", Thread.currentThread().getName());
                // Static synch method
                SynchClass.m1();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                // Static synch method
                SynchClass.m1(); // this will be locked
                System.out.printf("%s accessed the synch m1() method \n", Thread.currentThread().getName());
                // Accessing the second static synch method
                SynchClass.m2();
                System.out.printf("%s accessed the synch m2() method \n", Thread.currentThread().getName());
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                // accessing a regular static e non-synch method
                System.out.printf("%s accessing the static m3() method \n", Thread.currentThread().getName());
                SynchClass.m3();
            }
        });

        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                // accessing a synch instance method - no lock
                System.out.printf("%s accessing an instance synch m4() method \n", Thread.currentThread().getName());
                synchClass.m4();
            }
        });

        Thread t5 = new Thread(new Runnable() {
            @Override
            public void run() {
                // accessing a normal instance method - no lock
                System.out.printf("%s accessing a normal instance m5() method \n", Thread.currentThread().getName());
                synchClass.m5();
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
