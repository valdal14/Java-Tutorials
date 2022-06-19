package com.valdal14.executorframework.callableinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // Series of Features
        List<Future<Integer>> listOfFuture = new ArrayList<>();

        // Series of tasks we want to execute
        Mycallable[] callables = { new Mycallable(10),
        new Mycallable(20),
        new Mycallable(30),
        new Mycallable(40),
        new Mycallable(50),
        new Mycallable(60)};

        // Executor Service
        ExecutorService service = Executors.newFixedThreadPool(3);

        for (Mycallable callable : callables) {
            // return a Future
            Future<Integer> f = service.submit(callable);
            System.out.println("SUM: " + f.get());

            if(f.isDone()){
                System.out.println("Future ready to be retrieved....");
                // Adding the Future to the List
                listOfFuture.add(f);
            } else {
                System.out.println("Future object still in progress");
            }
        }


        // check whether or not we have completed the sum calculation
        while(listOfFuture.size() != 6){
            System.out.println("Service FUTURES is not terminated yet ....sleeping");
            System.out.println("Size of listOfFuture is " + listOfFuture.size());
            Thread.sleep(10000);
        }

        // shut down the service
        service.shutdown();

        System.out.println("-- SERVICE ITS OVER WE CAN CALCULATE THE TOTAL SUMS ---");
        Thread.sleep(1000);

        // Start the new ExecutorService
        ExecutorService sumService = Executors.newFixedThreadPool(3);

        // pass all the sums to MyCallableSum
        MyCallableSum myCallablesSums = new MyCallableSum(callables);
        List<Mycallable> myCallables = List.of(myCallablesSums.getCallable());

        for (Mycallable myCallable : myCallables) {
            Future f = sumService.submit(myCallable);
            f.get();
            if(f.isDone()){
                System.out.println("The total SUM: " + f.get());
            } else {
                System.out.println("Future SUM is still in progress");
            }
        }


        sumService.shutdown();

    }
}
