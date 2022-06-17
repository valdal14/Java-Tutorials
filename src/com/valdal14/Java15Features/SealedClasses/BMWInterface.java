package com.valdal14.Java15Features.SealedClasses;

public sealed interface BMWInterface permits BMWParent {

    default void startEngine(BMWParent car){
        System.out.println("Starting " + car.getClass().getName());
    }

    void applyColor(String color);
}
