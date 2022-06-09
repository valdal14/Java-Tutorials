package com.valdal14.polymorphism.methodoverriding;

public class MacBookAir extends MacBook{

    public String runtimePolyVariable = "MacBook Air Child";
    public MacBookAir(String modelName) {
        super(modelName);
    }

    @Override
    void start(MacBook macbook) {
        super.start(macbook);
    }

    @Override
    void shutdown(MacBook macbook) {
        super.shutdown(macbook);
    }
}
