package com.valdal14.innerclasses.localinnerclasses;

public class OuterClassExample {

    public OuterClassExample() {
        class LocaInnerConsructorClass {
            void f4(){
                System.out.println("Calling a method from a LocalInner class inside a constructor of an outer class");
            }
        }

        LocaInnerConsructorClass locaInnerConsructorClass = new LocaInnerConsructorClass();
        locaInnerConsructorClass.f4();
    }

    public void f1(){
        System.out.println("Insider OuterClass f1() method");
        // This class can be accessed only inside this method
        class LocalInner {
            void f2(){
                System.out.println("LocalInner class method call f2() inside outer method f1()");
            }
        }

        // To invoke the f2() method we can only do it from here
        LocalInner li = new LocalInner();
        li.f2();
    }

    // block
    static  {
        class LocalInnerStaticClass {
            void f3(){
                System.out.println("Calling a non-static method of a LocalInner class from a static block");
            }
        }

        LocalInnerStaticClass localInnerStaticClass = new LocalInnerStaticClass();
        localInnerStaticClass.f3();

    }

    public static void main(String[] args) {
        OuterClassExample outerClassExample = new OuterClassExample();
        outerClassExample.f1();
    }
}
