package com.valdal14.upcastingdowncasting;

/**
 * UPCASTING and DOWNCASTING --------------------
 *
 * -> The practice of casting on Object from parent to child and vice versa
 * ->  UPCASTING is from child to parent and this happens implicitly
 *      -> AppleLaptop appleLaptop = new MacBookAir();
 * -> This is like casting from byte to int
 *
 * -> DOWNCASTING on the other hands must be done explicitly
 *      -> This is from parent to child
 *      -> MacBookAir macBookAir1 = (MacBookAir) appleLaptop;
 */

public class TestUpcastingAndDowncasting {

    public static void main(String[] args) {

        // From child (MacBookAir) to parent (AppleLaptop)
        AppleLaptop appleLaptop = new MacBookAir();
        appleLaptop.start();
        appleLaptop.stop();
        // From child (MacBookAir) to parent (MacBook - AppleLaptop)
        MacBookAir macBookAir1 = (MacBookAir) appleLaptop;
        macBookAir1.start();
        // specific just for the child MacBook Air model
        macBookAir1.macBoorAirInfo();
        // we need to upcast again if we want to use it with the parent
        ((MacBookAir) appleLaptop).macBoorAirInfo();
    }
}
