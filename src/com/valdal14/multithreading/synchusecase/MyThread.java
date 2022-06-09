package com.valdal14.multithreading.synchusecase;

public class MyThread {

    public DisplayMessage dm;
    public String name;

    public MyThread(DisplayMessage dm, String name) {
        this.dm = dm;
        this.name = name;
    }

    public Thread t = new Thread(new Runnable() {
        @Override
        public void run() {
            dm.sayHello(name);
        }
    });
}
