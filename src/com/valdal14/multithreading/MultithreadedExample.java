package com.valdal14.multithreading;

public class MultithreadedExample extends Thread {

    public static void main(String[] args) throws InterruptedException {

        MultithreadedExample mt = new MultithreadedExample();
        // To start or invoke a thread we need to invoke the start() method
        // that internally create a thread space that will execute the run() method
        mt.start();

        System.out.println("");

        mt.printNumbers();
    }

    // Overriding the Thread.run method
    @Override
    public void run() {
        for(int j = 1; j <= 200; j++){
            System.out.print("j: " + j + "\t");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Child thread interrupted: " + e.getMessage());
            }
        }
    }

    void printNumbers() throws InterruptedException {
        for(int i = 1; i <= 200; i++){
            System.out.print("i: " + i + "\t");
            Thread.sleep(1000);
        }
    }
}
