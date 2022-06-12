package com.valdal14.annotations.AnnotationHandsOn;

public class A {

    @Deprecated
    public static final double VERSION = 2.1;
    @Deprecated
    public void myMethod(){

    }

    public String greet(String name){
        return "Hello " + name;
    }

}
