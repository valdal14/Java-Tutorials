package com.valdal14.multithreading.synchusecase;

public class SynchDemo {

    public static void main(String[] args) {

        DisplayMessage dm = new DisplayMessage();

        MyThread t1 = new MyThread(dm, "Valerio");
        MyThread t2 = new MyThread(dm, "Grazie");

        t1.t.start();
        t2.t.start();
    }
}
