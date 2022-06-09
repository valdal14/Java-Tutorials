package com.valdal14.multithreading.synchronization;

public class DemoSynchronized {

    public static void main(String[] args) throws InterruptedException {

        Customer c1 = new Customer("Valerio","D'Alessio", 1211421414);

        // Spawning Threads
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                    System.out.println(Thread.currentThread().getName());
                    c1.addCustomersToList("Valerio","D'Alessio", 1211421414);
                } catch (InterruptedException e) {
                    System.out.printf("Exception %s - %s", Thread.currentThread().getName(), e.getMessage());
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                    System.out.println(Thread.currentThread().getName());
                    c1.addCustomersToList("Grazie","D'Alessio", 1211421415);
                } catch (InterruptedException e) {
                    System.out.printf("Exception %s - %s", Thread.currentThread().getName(), e.getMessage());
                }

            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                    System.out.println(Thread.currentThread().getName());
                    c1.addCustomersToList("Leonor","Masia", 1211421416);
                } catch (InterruptedException e) {
                    System.out.printf("Exception %s - %s", Thread.currentThread().getName(), e.getMessage());
                }

            }
        });

        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                    System.out.println(Thread.currentThread().getName());
                    c1.removeCustomerFromList(0);
                } catch (InterruptedException e) {
                    System.out.printf("Exception %s - %s", Thread.currentThread().getName(), e.getMessage());
                }

            }
        });

        Thread t5 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                    System.out.println(Thread.currentThread().getName());
                    c1.removeCustomerFromList(1);
                } catch (InterruptedException e) {
                    System.out.printf("Exception %s - %s", Thread.currentThread().getName(), e.getMessage());
                }

            }
        });

        t1.start();
        t1.setPriority(Thread.MAX_PRIORITY);

        t2.start();
        t2.setPriority(Thread.MAX_PRIORITY);

        t3.start();
        t3.setPriority(Thread.MAX_PRIORITY);

        t4.start();
        t4.setPriority(Thread.MIN_PRIORITY);

        t5.start();
        t5.setPriority(Thread.MIN_PRIORITY);

        Thread t6 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                c1.getCustomer(2);
            }
        });

        t6.start();
        t6.join();

        Thread t7 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                c1.getCustomer(2);
            }
        });

        t7.start();
        t7.join();

        Thread t8 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                c1.getCustomer(0);
                c1.printCustomerListSize();
            }
        });

        t8.start();
        t8.join();


    }
}
