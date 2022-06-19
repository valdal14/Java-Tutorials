package com.valdal14.innerclasses.staticinnerclass;

public class OuterClass {

    static class Inner {

        static void f2(){
            System.out.println("Ineer Static Method f2");
        }
    }

    static void f1(){
        System.out.println("Outer Static Method f1");
    }

    public static void main(String[] args) {
        OuterClass.f1();
        OuterClass.Inner.f2();
    }
}
