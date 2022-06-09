package com.valdal14.executorframework.callableinterface;

import java.util.concurrent.Callable;

/**
 *  When we implements the Callable Interface we must specify the value we want back
 */

public class Mycallable implements Callable<Integer> {

    int num;

    int sum = 0;

    public int getSum() {
        return sum;
    }

    public Mycallable(int num) {
        this.num = num;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName() + " is calculating the sum of all the numbers up to " + this.num);
        for (int i = 0; i <= this.num; i++) {
            this.sum += i;
            Thread.sleep(100);
        }
        return this.sum;
    }
}
