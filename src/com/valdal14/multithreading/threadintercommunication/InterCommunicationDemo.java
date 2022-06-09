package com.valdal14.multithreading.threadintercommunication;

public class InterCommunicationDemo {

    public static void main(String[] args) throws InterruptedException {

        CounterClass counterClass = new CounterClass();
        counterClass.start();

        // To be in synch both all threads must be in synch
        synchronized (counterClass){
            counterClass.wait();
            // Main thread has been notified
            System.out.printf("The sum from t2 is %d \n", counterClass.counter);
        }
    }
}
