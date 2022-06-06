package com.valdal14.garbagecollector;

public class GarbageCollector {

    /**
     *  GARBAGE COLLECTOR ------------------------------------------------------------------------------------
     *
     *  -> JVM PROCESS =======================================================================================
     *
     *      -> Starting from the MAIN Thread, each Thread has a space in the Stack where all the local
     *         primitives types are stored and the HEAP space where all the object memory is allocated
     *      -> As we have learned the GC is a Daemon Thread that runs in the JVM (background) and removes
     *         the objects from the HEAP when they are unreachable
     *      -> An Object is unreachable when:
     *
     *          Account x = new Account(); // x points to the memory location stored in the Heap
     *          Account y = new Account(); // y points to the memory location stored in the Heap
     *          x = new Account();         // the Object 1 will be unreachable becuase x now points
     *                                        to a new memory location (3)
     *
     *          if we do y = x;            // Both 1 and 2 will be unreachable because both objs
     *                                        will now point to a new address 3 in memory
     *          if we do y, x = null;      // All the object will be garbage collected
     *
     *      -> We cannot force the GC to run but we can always request its execution by using System.gc();
     *  ======================================================================================================
     */
}
