package com.valdal14.collectionsconcurrency;

/**
 *  CONCURRENT COLLECTIONS -------------------------------------------------------------------------------------
 *
 *  -> Traditional Collections such as ArrayList, HashSet, HashMap implements a mechanisms called Fail Fast Iterator
 *  -> When we get an Iterator out of these collections and loops throught one of them concurrently and we
 *     may want to insert or delete something we may get an exception called ConcurrentModificationException even an
 *     a single-threaded env is possible that this occurs.
 *  -> When a Thread place a lock the entire collection is locked...
 *  -> This is where the concurrent collections comes into play
 *
 *  -> CopyOnWriteArrayList CLASS and CopyOnWriteArraySet CLASS
 *      --> if a thread is trying to access the List methods will crete a copy and the changes will be make on
 *          the copy of the list or set. In these types of collections a lock is not placed.... As some point
 *          those changes will be synched with the original set or array. No Thread lock waiting is needed
 *      --> if there are 20 threads all of them accessing the same time a set or array 20 copies will be
 *          created. This is a very good scenario when we have a lot of read operations happenings and few writes.
 *      --> On the contrary, if we have a lot of writes operation these will decrease a lot the performances.
 *      --> These concurrent collection classes implement Fails Safe Iterator unlike traditional collections
 *
 *   -> ConcurrentHashMap CLASS
 *      --> Instead of locking the entire Map, ConcurrentHashMap uses a "Fine grained Locking" therefore at entry
 *          level (key-value pair)
 *      ---> To get the Iterator from a map we must use the following:
 *          ----> Iterator<Integer> iterator = map.keySet().iterator();
 *
 *   -> BlockingQueue
 *      --> This is another concurrent data structure
 *      --> It is very handy to implements the PRODUCER-CONSUMER Design Pattern
 *      --> There are three elements in this pattern
 *          ----> A Blocking Queue - A Producer that put things in the Queue - A Consumer that consumes the Queue
 *          ----> The PRODUCER will use the put method
 *          ----> The CONSUMER will use the take method
 *      --> The Benefit here is that the Blocking Queue will automatically block the Producer to add new things
 *          into the Blocking Queue if the Consumer has not yet finished its work.
 *      --> If there is nothing to consumer and the Consumer is trying to take something it will be also blocked
 *      --> BlockingQueue is the Interface while the ArrayBlockingQueue is the implementation
 *          ---> BlockingQueue<String> queue = new ArrayBlockingQueue<>(1024);
 *
 *  ------------------------------------------------------------------------------------------------------------
 */
public class ConcurrentCollections {
}
