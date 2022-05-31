package com.valdal14.abstraction;

// Creating an abstract class
public abstract class BMW {

    // Concrete method that will be inherited
    void carModelInfo(SeriesThree model){
        System.out.printf("This is a %s BMW model car with number %d \n", model.getModelName(), model.getModelNumber());
    }

    // Static concrete method that can be used by the abstact class only
    static void BMWinfo(){
        System.out.println("Static method of the BMW abstract class");
    }

    // abstract method will be implemented on the concrete class
    abstract void accelerate(SeriesThree model);

    abstract void breakEngine(SeriesThree model);
}
