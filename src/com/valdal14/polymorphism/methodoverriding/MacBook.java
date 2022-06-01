package com.valdal14.polymorphism.methodoverriding;

public class MacBook implements AppleLaptop {

    public String runtimePolyVariable = "MacBook Parent";
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

    // method implemented from the interface
    @Override
    public void start() {
        System.out.println("An apple laptop is starting");
    }

    @Override
    public void shutdown() {
        System.out.println("An apple laptop is shutting down");
    }
}
