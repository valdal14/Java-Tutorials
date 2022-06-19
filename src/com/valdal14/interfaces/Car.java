package com.valdal14.interfaces;

public interface Car {

    // We can define only constants in an interface
    // we can omit the public static final since it will be inferred by the compiler
    String MODELNAME = "Honda Civic";

    void go();
    void stop();

}
