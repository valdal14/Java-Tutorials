package com.valdal14.upcastingdowncasting;

public class MacBookAir extends MacBook {

    @Override
    public void start() {
        super.start();
        System.out.println(" Air");
    }

    @Override
    public void stop() {
        super.stop();
        System.out.println(" Air");
    }

    public void macBoorAirInfo(){
        System.out.println("This is specific for MacBook Air Models only");
    }
}
