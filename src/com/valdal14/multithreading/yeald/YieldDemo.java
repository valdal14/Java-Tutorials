package com.valdal14.multithreading.yeald;

public class YieldDemo {

    public static void main(String[] args) throws InterruptedException {
        // Starting the child thread
        YieldClass.t.start();

        for(int j = 1; j <= 10; j++){
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(1000);
        }
    }

}
