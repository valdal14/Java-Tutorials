package com.valdal14.generics.wildcardparams.withsuper;

import java.util.ArrayList;

public class WildCardWithParamsAndSuper {

    public void myMethod(ArrayList<? extends A> list){
        list.add(null);
        // list.add("String"); still not allowed
    }

    public void  myNewMethod(ArrayList<? super B> list){
        list.add(null);
        // now we can add the child class B that extends A
        list.add(new B()); // no compile time issue
    }
}
