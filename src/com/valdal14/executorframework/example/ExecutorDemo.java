package com.valdal14.executorframework.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * This is where we will create the Thread pool
 */

public class ExecutorDemo {

    public static void main(String[] args) {
        // Create a set of tasks
        CheckProcessorTask[] cps = { new CheckProcessorTask("ATM"),
                new CheckProcessorTask("Bank"),
                new CheckProcessorTask("Mobile"),
                new CheckProcessorTask("Web App")};

        // Let's create a fixed Thread Pool
        ExecutorService service = Executors.newFixedThreadPool(2);

        // We will manage 4 upcoming tasks only with these two threads
        for (CheckProcessorTask task: cps) {
            service.submit(task);
        }

        // Once done we must shut down the Executor Service
        service.shutdown();
    }
}
