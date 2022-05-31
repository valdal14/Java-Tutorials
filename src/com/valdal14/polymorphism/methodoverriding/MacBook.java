package com.valdal14.polymorphism.methodoverriding;

public class MacBook {

    private String modelName;

    public String getModelName() {
        return modelName;
    }

    void start(MacBook macbook){
        System.out.println("Starting " + macbook.getModelName());
    }

    void shutdown(MacBook macbook){
        System.out.println("Shutting down " + macbook.getModelName());
    }

    public MacBook(String modelName) {
        this.modelName = modelName;
    }
}
