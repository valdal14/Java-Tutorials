package com.valdal14.polymorphism.methodoverloading;

public class CompileTimeOrStaticBindingPoly {

    public void add(int a, int b){
        System.out.println(a + b);
    }

    public void add(float a, float b){
        System.out.println(a + b);
    }

    public void add(int a, int b, int c){
        System.out.println(a + b + c);
    }
}
