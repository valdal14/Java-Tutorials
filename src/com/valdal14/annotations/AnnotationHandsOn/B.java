package com.valdal14.annotations.AnnotationHandsOn;

import java.util.ArrayList;
import java.util.List;

public class B extends A {

    @Override
    public String greet(String name){
        return "Hello " + name;
    }

    @SuppressWarnings({"deprecated", "rawtype"})
    public static void main(String[] args) {

        A a = new A();
        System.out.println(a.hashCode());

        a.myMethod();

        double version = A.VERSION;


        List list = new ArrayList<>();
        System.out.println(list);

    }
}
