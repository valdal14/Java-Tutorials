package com.valdal14.multithreading.threadgroups;

public class ThreadGroupDemo {

    public static void main(String[] args) {
        // Get the name of the current ThreadGroup
        System.out.println(Thread.currentThread().getThreadGroup()); // java.lang.ThreadGroup[name=main,maxpri=10]
        System.out.println(Thread.currentThread().getThreadGroup().getName()); // main

        // Every thread group will have a parent
        System.out.println(Thread.currentThread().getThreadGroup().getParent()); // java.lang.ThreadGroup[name=system,maxpri=10]

        // Beyond system system we will get a NullPointerException

        // Create a ThreadGroup
        ThreadGroup parent = new ThreadGroup("Parent");
        ThreadGroup child = new ThreadGroup(parent, "Child");
        System.out.println(child.getParent().getName()); // Parent


        // Adding Threads to a group
        Thread t1 = new Thread(child, "Thread 1");
        Thread t2 = new Thread(child, "Thread 2");

        System.out.println(t1.getThreadGroup().getParent()); // java.lang.ThreadGroup[name=Parent,maxpri=10]

        // ThreadGroups can also have priorities
        System.out.println(t2.getPriority()); // 5

        // Set the priority for a ThreadGroup
        child.setMaxPriority(7);
        // The priority is still 5. We need to do it before creating the new group: See below
        System.out.println("Child group t1 priority: " + t1.getPriority());
        System.out.println("Child group t1 priority: " + t2.getPriority());


        ThreadGroup newParentThreadGroup = new ThreadGroup("VD14");
        newParentThreadGroup.setMaxPriority(8);
        ThreadGroup newChildThreadGroup = new ThreadGroup(newParentThreadGroup, "New Children Thread Group");
        // set the new priority for this group
        newChildThreadGroup.setMaxPriority(8);
        // Adding Threads to a group
        Thread t3 = new Thread(newChildThreadGroup, "Thread 4");
        Thread t4 = new Thread(newChildThreadGroup, "Thread 4");

        System.out.println(t3.getPriority()); // 7
        System.out.println(t4.getPriority()); // 7


    }
}
