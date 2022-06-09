package com.valdal14.innerclasses.callnonstaticinneresources;

public class OutClass {

    static class Inner {

        static void f2(){
            System.out.println("Ineer Static Method f2");
        }

        // Non static member
        void f3(){
            System.out.println("Inner non-static Method f3");
        }
    }

    static void f1(){
        System.out.println("Outer Static Method f1");
    }

    public static void main(String[] args) {
        OutClass.f1();
        OutClass.Inner.f2();
        // Call a non-static member in the inner class
        // We need an instance of the Inner class becuase
        // we need to call a non-static method
        Inner inner = new Inner();
        inner.f3();
    }
}
