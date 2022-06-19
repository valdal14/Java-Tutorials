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
 *
 * -> The Yield method will yield to the main thread to finish the execution before starting
 *      -> Commenting Thread.yield() both thread will run in parallel
 *
 * -> Interrupt method:
 *      -> Used to interrupt the thread class
 *      -> We can only interrupt a thread that is in sleep mode
 *
 * -> Thread Synchronization:
 *      -> When two threads are accessing the same object simultaneously they may corrupt each other data
 *      -> Especially in insert, update or delete or Object data
 *      -> We can use the synchronized void myMethod() to synch them
 *      -> The first thread accessing the data will put a LOCK on that object
 *      -> And no other Thread will be able to access to this myMethod() until the first thread releases the lock
 *      -> Acquiring and releasing the lock in a JVM task
 *          -> We can use the synchronized keyword on blocks and static methods
 *          -> Not even another synchronized method will be able to access to the synchronized myMethod()
 *      -> If a method tries to access on a lock method it will go on Wait State
 *      -> In another thread try to access an Object method that is not SYNCH it will be able to access it
 *      -> synchronized is at Object level and not method level
 *      -> Method that adds and remove data should be marked as synchronized
 *      -> Methods that reads the data can do not need to be synchronized  methods
 *
 *  -> Class Level Lock:
 *      -> Every class in Java has a unique lock
 *      -> If a Thread wants to execute a "static synchronized method" it will get fist the class level lock
 *      -> In other words the very first thread that wants to execute the "static synchronized method"  will get
 *         the class level lock
 *      -> All other threads will have to wait until the lock is released to execute the "static synchronized method"
 *         as well as any other "static synchronized method" in that class
 *      -> They can still access static methods, synchronized INSTANCE method, and instance method
 *
 *  -> Synchronizing Block:
 *      -> If we need few lines of code to be in synch with threads we can use the Synchronized Block inside a method
 *      -> Instead of marking the entire method as synchronized we can create a synch block:
 *          public void myMethod(){
 *              code....
 *              synchronized(this) {
 *
 *              }
 *              code...
 *          }
 *      -> The advantage is that multiple threads can enter this method but the first reaching the synch block
 *         will put a lock and the rest must wait until the first has done (lock will be released)
 *      -> We can create Synchronized Block in three waus:
 *          --> by passing the reference to the object: synchronized(this) (will lock the current object)
 *          --> we can pass any object: synchronized(x) and the current thread will get a lock to the passed object
 *          --> Finally we can get a class level lock: synchronized(MyClass.class) to get a class lock
 *
 * -> InterThread Communication;
 *      -> When we have multiple threads running in our application at some point we need these threads to
 *         communicate with each other. This is where the following methods come into play:
 *              --> wait()
 *              --> notify()
 *              --> notitfyAll()
 *          Suppose we have a Thread t1 that has a lock on OBj
 *          t2 needs t1 to finish its job before proceeding
 *          When t1 invoke the wait() method will give up the lock and t2 could start accessing it
 *          When t2 has done can notify() t1 that is has done and t1 can exist from the waiting stage
 *      -> To be able to do so, wait() and notify() the thread needs to ne in a synchronized state either
 *         withing a Synch Block or a Synch method. If this is not the case we will get an IllegalMonitorStateException
 *      -> When a Thread starts it goes from Runnable to Running and when calls the wait() method it will be
 *         pushed into a wait state. When we notify or overload the time expires or it get interrupt() it will be able
 *         to get a lock on the object again and go back to the Runnable state. When it has finished it will fo to the
 *         dead state.
 *
 * -> java.lang.ThreadGroup class:
 *      -> The ThreadGroup class allows us to group a set of threads that are allowed to do the same task
 *      -> We might have a Group of threads that builds object and a group of thread that consumes them
 *      -> Every thread in Java belongs to a particular group
 *      -> I.E
 *                                   System
 *                                   ------
 *                       Main       Finalizer       SignalDispacher
 *                     ----------
 *                     Main Thread
 *                     Thread 1 etc
 *                     ThreadGroups
 *                     -----------
 *                     Thread 2
 *                     Thread 3
 *
 * -> ThreadGroups can also have priorities
 *
 * -> DEAMON THREAD:
 *      -> The Deamon thread are threads that runs in background:
 *          -> The Garbace Collector thread
 *          -> We can check if a thread is a Deamon thread by using the method isDemon()
 *          -> We can set a thread as Deamon by using the setDemon() method
 *              --> This must be done before the thread starts otherwise we will get an IllegalThreadStateException
 *          -> The MAIN thread is NOT a Demon thread and we cannot changed
 *          -> The MAIN thread will not wait for DAEMON thread to finish
 *          -> NOTE: As soon as the last Daemon thread has finished with the execution the JVM will terminate
 *                   all daemon threads
 *          -> If a parent is a Daemon thread also its children will be
 *
 * -> DEAD LOCK:
 *      -> Thread Dead lock happens when we have multiple Threads waiting for other resources
 *      -> This will results in Threads waiting for each other until we do not have memory
 *      -> if we have a Thread accessing an Object in which few method are synchronized methods inside a class
 *         the Thread will put a lock in all of synchronized methods
 */

public class MainMultithreading {

    public static void main(String[] args) {

    }
}
