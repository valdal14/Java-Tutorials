package com.valdal14.multithreading.threadintercommunication;

public class CounterClass extends Thread {

    public static int counter = 0;
    public static void returnCounting(int start, int finish){
        for(int i = start; i <= finish; i++){
            CounterClass.counter += i;
            System.out.println("Current status: " + CounterClass.counter);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Exception " + e.getMessage());
            }
        }
    }

    @Override
    public void run() {
        synchronized (this){
            CounterClass.returnCounting(0, 5);
            // now we can notify the main thread
            this.notify();
        }
    }
}
