package com.valdal14.polymorphism.methodoverriding;

public class MacBookPro extends MacBook {

    public String runtimePolyVariable = "MacBook Pro Child";
    public MacBookPro(String modelName) {
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
