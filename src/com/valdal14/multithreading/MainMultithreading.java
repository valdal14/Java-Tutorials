package com.valdal14.multithreading;

/**
 * MULTITHREADING in JAVA --------------------
 *
 * -> To implement Multithreading in Java there are a couple of ways
 *      -> Extend the Thread class
 *      -> Implement the Runnable Interface
 *
 * -> EXTEND THREAD CLASS
 * -> If we extend the Thread class we must override the run() method
 * -> To spawn a new thread we have to call the start() method that internally will call the run() method
 * -> We can use the static method Thread.sleep() to pause the execution
 *      -> Thread.sleep() throws a Exceptions or CHECKED exception and therefore we have to handle it at
 *          compile time
 *
 * -> the join() method is used to join the current thread and help us to start the execution of
 *    the program at certain stages
 *
 * -> Thread Identity:
 *      -> Each thread will have a name
 *      -> When we start() a thread also a new name will be assigned
 *      -> The current thread can be retrieved by using the static method currentThread();
 *          -> Thread currentT = Thread.currentThread();
 *
 * -> Thread Priority:
 *      -> We can assign a priority level to each thread in Java
 *      -> This must be done before we called the start() method
 *      -> Priority is expressed from 1 to 10
 *          -> 1 being the minimum and 10 the maximum
 *          -> We can also use the Thread class constants MAX_PRIORITY, MIN_PRIORITY, NORM_PRIORITY
 *
 * -> Using the Runnable Interface:
 *      -> In the runnable interface we do not have the start() method.
 *      -> We need to create an instance of the Thread class
 *      -> The constructor take an object of type Runnable
 *      -> Implementing Multithreading with Runnable is the preferred approach because we can extend other classes
 */

public class MainMultithreading {

    public static void main(String[] args) {

    }
}
