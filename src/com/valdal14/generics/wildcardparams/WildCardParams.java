package com.valdal14.generics.wildcardparams;

import java.util.ArrayList;

public class WildCardParams {

    // Method with Wildcard generics params
    // ? wildcard allows only NULL values
    public void mymethod(ArrayList<?> list){
        list.add(null);
        // list.add("String"); // compile time error
    }

    // We need a class that extends String
    public void myNewMethod(ArrayList<? extends Thread> l){

    }

    public static void main(String[] args) {
        WildCardParams wcp = new WildCardParams();
        wcp.mymethod(new ArrayList<String>());
        // wcp.mymethod(12); cannot add anything rather than NULL value

        wcp.myNewMethod(new ArrayList<Thread>());
    }
}

class ExtendsString extends Thread { }