package com.valdal14.executorframework.callableinterface;

import java.util.concurrent.Callable;

public class MyCallableSum implements Callable<Integer> {
    Mycallable[] callable;

    public Mycallable[] getCallable() {
        return callable;
    }

    public MyCallableSum(Mycallable[] callable){
        this.callable = callable;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (Mycallable callable : this.callable) {
            sum += callable.sum;
        }
        return sum;
    }
}
