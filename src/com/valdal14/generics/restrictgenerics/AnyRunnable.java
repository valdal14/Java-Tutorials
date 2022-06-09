package com.valdal14.generics.restrictgenerics;

import java.util.Comparator;
import java.util.Iterator;

// Restrict the range of possible types we can use for this class
public class AnyRunnable<T extends Runnable> { }

// Multiple restrictions
class MyRunnable<T extends Thread&Comparable>{}

// Multi T types with multi restrictions
class MultipleGenericsTypes<T extends Thread&Comparable, C extends Thread&Iterator> {
    T objT;
    C objC;

    public MultipleGenericsTypes() {}

    public T getObjT() {
        return objT;
    }

    public C getObjC() {
        return objC;
    }

    public MultipleGenericsTypes(T objT, C objC) {
        this.objT = objT;
        this.objC = objC;
    }
}

class MyThreadAndComparableTestClass extends Thread implements Comparable<Integer>{
    @Override
    public int compareTo(Integer integer) {
        return 0;
    }
}

class MyThreadAndIteratorTestClass extends Thread implements Iterator<Integer>{

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Integer next() {
        return null;
    }
}



class Demo {
    public static void main(String[] args) {
        // This works because the Thread class implement the Runnable Interface
        AnyRunnable<Thread> t = new AnyRunnable<Thread>(); // public class Thread implements Runnable

        // This will not work:
        // Type parameter 'java.lang.reflect.Array' is not within its bound; should implement 'java.lang.Runnable'
        // AnyRunnable<Array> arr = new AnyRunnable<Array>();

        // Multiple restrictions
        /**
         * We needed a class that extends the Thread class and implements the Comparable interface
         *
         * class MyThreadAndComparableTestClass extends Thread implements Comparable<Integer>{
         *     @Override
         *     public int compareTo(Integer integer) {
         *         return 0;
         *     }
         * }
         */

        // now we are compliance
        MyRunnable<MyThreadAndComparableTestClass> myRunnable = new MyRunnable<MyThreadAndComparableTestClass>();


        // Multi T types with multi restrictions
        MultipleGenericsTypes<MyThreadAndComparableTestClass, MyThreadAndIteratorTestClass> myClass
                = new MultipleGenericsTypes<MyThreadAndComparableTestClass, MyThreadAndIteratorTestClass>();

    }
}
