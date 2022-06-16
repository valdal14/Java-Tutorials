package com.valdal14.java9features.TryWithResources;

public class MyWorker implements AutoCloseable{

    public MyWorker() {
        System.out.println("Creating the resource");
    }

    public void doSomething() throws InterruptedException {
        System.out.println("I am going somethind....");
        Thread.sleep(1000);
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing the resource");
    }
}
