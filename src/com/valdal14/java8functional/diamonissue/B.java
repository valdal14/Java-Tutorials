package com.valdal14.java8functional.diamonissue;

public class B implements A, X {
    @Override
    public void interfaceMethod() {
        //A.super.interfaceMethod();
        System.out.println("interfaceMethod override by class B that implements A, X default method");
    }
}
