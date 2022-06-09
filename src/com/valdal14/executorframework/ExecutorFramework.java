package com.valdal14.executorframework;

public class ExecutorFramework {
    public static void main(String[] args) {
        /**
         *  THE EXECUTOR FRAMEWORK ---------------------------------------------------------------
         *
         *  -> Disadvantages of traditional thread creation =====================================
         *      -> Limitations:
         *          -> Suppose we are working on a "Check Processor" application that can handles
         *             the online banking transaction from different sources (ATM, Mobiles etc...)
         *          -> And we want the Check Processor to be Multithreaded to make the best us of
         *             computing resources and process multiple checks in parallel
         *          -> If we use the traditional approach made of Extending the Thread class or
         *             using the runnable interface we need to take care of the entire lifecycle
         *              -> This is TIME Consuming
         *              -> Poor Resources Management
         *              -> The app might not be robust (we may collapse if we get a lot of checks
         *                 in parallel and we may run out of memory soon)
         *          -> This is where the JAVA EXECUTOR FRAMEWORK comes into play
         * =====================================================================================
         *  -> The EXECUTOR FRAMEWORK was introduced in Java 1.5 version
         *  -> It introduced the concept of thread pool
         *      -> Executor e = Executor.newCachedThreadPool()
         *  -> It allows us to create a Thread Pool of worker Threads which can be be assigned
         *     to a particular task
         *  -> When a Thread is done with its task, instead of dying out it will go back to the
         *     Thread Pool which is very handy since it can be reused again
         *
         *  -> The JAVA EXECUTOR FRAMEWORK manages the entire lifecycle of the thread
         *      -> We simply create a class which is our Thread:
         *          --> IE: Runnable task = new CheckProcessor() which implements the Runnable
         *                  Interface
         *          --> We create an Executor Service : Executor e = Executor.newCachedThreadPool()
         *          --> And we assign a task : e.execute(task)
         *      -> There are different types of Thread Pools
         *      -> We can define an upper bound to limit the amount of threads the application
         *         can generates/uses
         *      -> It will be more robust: If we define a Thread Pool Upper bound of 100 Threads
         *         and 1000 checks to process will come, the app will not crash. It will slow down
         *         but not crash and we can always re-define the amount of threads we can manage
         *         based on the workload we expect.
         *  =====================================================================================
         *
         *  -> CALLABLE and FUTURE Interfaces ===================================================
         *      -> Both a are features of the Java EXECUTOR FRAMEWORK
         *      -> When we implement the Runnable Interface the run() method cannot return any
         *         value
         *      -> This is where the Callable<V> Interface comes into picture
         *          --> Using Callable<V> and a second method called V call() we can return any
         *              type of values
         *          --> The Callable<V> Interface is a Generic interface and we implement the
         *              the V call() method instead of the run() method
         *          --> We pass a Callable<V> instance to the Executor Framework and the Executor
         *              service will return a Future object
         *
         *              Executor Framework
         *              Future f = service.submit(myCallable);
         *
         *          --> This FUTURE Interface has several methods we can use:
         *              ---> g.get(); to get the result and check if the result is ready
         *                  ---> The g.get() throws 3 different types of exceptions:
         *                      ----> InterruptedException
         *                      ----> ExecutionException
         *                      ----> CancellationException
         *  -> When we implements the Callable Interface we must specify the value we want back
         *  =====================================================================================
         */
    }
}
