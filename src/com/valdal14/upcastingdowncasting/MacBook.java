package com.valdal14.upcastingdowncasting;

public class MacBook implements AppleLaptop {

    @Override
    public void start() {
        System.out.printf("Starting a %s MacBook", AppleLaptop.LAPTOPMANUFACTURER);
    }

    @Override
    public void stop() {
        System.out.printf("Shutting down an %s MacBook", AppleLaptop.LAPTOPMANUFACTURER);
    }
}
