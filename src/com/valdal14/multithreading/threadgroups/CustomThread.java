package com.valdal14.multithreading.threadgroups;

public class CustomThread extends Thread {

    public CustomThread(ThreadGroup g, String name){
        super(g, name);
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
