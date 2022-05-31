package com.valdal14.interfaces;

public class Honda implements Car{

    @Override
    public void go() {
        System.out.println("Honda Car is moving forward");
    }

    @Override
    public void stop() {
        System.out.println("Honda car is stopping...");
    }
}
