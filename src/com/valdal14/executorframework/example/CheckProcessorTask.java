package com.valdal14.executorframework.example;

/**
 * In this file we created our Thread CheckProcessorTask
 * responsible of processing checks
 */

public class CheckProcessorTask implements Runnable {

    String name;

    public CheckProcessorTask(String name){
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " Check Processor has started processing the check " + Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Exception " + e.getMessage());
        }

        System.out.println(name + " Check Processor has completed the processing of the check "  + Thread.currentThread().getName());
    }
}
