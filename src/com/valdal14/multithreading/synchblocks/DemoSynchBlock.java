package com.valdal14.multithreading.synchblocks;

public class DemoSynchBlock {

    public static void main(String[] args) throws InterruptedException {

        Person person1 = new Person("Valerio", "D'Alessio");
        Person person2 = new Person("Grazia", "D'Alessio");
        Person person3 = new Person("Leonor", "D'Alessio");

        Customer customer = new Customer();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                customer.addPersonToCustomerList(person1);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                customer.addPersonToCustomerList(person2);
                customer.addPersonToCustomerList(person3);
            }
        });

        t1.start();
        t2.start();

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                customer.printListOfCustomer();
            }
        });

        t2.join(); // join to wait for the next execution

        t3.setPriority(Thread.MIN_PRIORITY);
        t3.start();


    }
}
