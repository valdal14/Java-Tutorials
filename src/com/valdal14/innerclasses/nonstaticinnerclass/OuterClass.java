package com.valdal14.innerclasses.nonstaticinnerclass;

public class OuterClass {

    public void f1(){
        System.out.println("Outer class static method f1");
    }

    class Inner {
        public void f2(){
            System.out.println("Inner class non-static method f2");
        }
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.f1();
        // Instance of a non-static inner class inside a static method
        OuterClass.Inner inner = outerClass.new Inner();
        inner.f2();
    }
}
