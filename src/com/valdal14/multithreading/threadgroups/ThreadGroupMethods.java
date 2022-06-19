package com.valdal14.multithreading.threadgroups;

public class ThreadGroupMethods {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup threadGroup = new ThreadGroup("MyThreadGroup");

        CustomThread customThread1 = new CustomThread(threadGroup, "Thread 1");
        CustomThread customThread2 = new CustomThread(threadGroup, "Thread 2");

        customThread1.start();
        customThread2.start();

        // Get the current active threads
        System.out.println(threadGroup.activeCount());

        // List the info of a group
        threadGroup.list();
//        java.lang.ThreadGroup[name=MyThreadGroup,maxpri=10]
//        Thread[Thread 1,5,MyThreadGroup]
//        Thread[Thread 2,5,MyThreadGroup]

        // Since now everything is sleeping we will get 0
        Thread.sleep(5000);
        System.out.println(threadGroup.activeCount()); // 0

        // Thread done
        threadGroup.list(); // java.lang.ThreadGroup[name=MyThreadGroup,maxpri=10]
    }
}
