package com.valdal14.multithreading.deamonthreads;

public class DeamonThreadDemo {

    public static void main(String[] args) {

        // check if the main thread is a Deamon thread
        System.out.println(Thread.currentThread().getName()); // main
        System.out.println(Thread.currentThread().isDaemon()); // false

        MyThread t1 = new MyThread();

        t1.setDaemon(true);
        t1.start();
        System.out.println(t1.getName());
        System.out.printf("%s is Daemon Thread = %s \n", t1.getName(), t1.isDaemon());
        // Thread-0 is Daemon Thread = true
    }
}
