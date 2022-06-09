package com.valdal14.innerclasses.accessoutermemberfrominnerclass;

/**
 * How to access members of the Outer class from an inner class
 */

public class OuterClassDemo {

    private static int x = 50;
    private int y = 70;

    public OuterClassDemo(int y){
        this.y = y;
    }

    public void f1(){
        System.out.println("Outer class static method f1");
    }

    class Inner {
        public void f2(){
            // If a variable is static we simply access to it using the Outer class
            System.out.println("Inner f2() method accessing outclass static variable " + OuterClassDemo.x);
        }

        public void f3(){
            // if a variable is a class variable
            System.out.println("Inner f3() method accessing outerclass non-static variable "  + OuterClassDemo.this.y);
            // we can also access to method in the outerclass
            OuterClassDemo.this.f1();
        }
    }

    public static void main(String[] args) {
        OuterClassDemo outerClass = new OuterClassDemo(80);
        outerClass.f1();
        // Instance of a non-static inner class inside a static method
        OuterClassDemo.Inner inner = outerClass.new Inner();
        inner.f2();
        inner.f3();
    }
}
