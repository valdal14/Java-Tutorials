package com.valdal14.interfaces.realexample;

public abstract class HP implements TouchScreenLaptop {

    @Override
    public void scroll() {
        System.out.println("This is how an HP laptop scrolls");
    }
}
