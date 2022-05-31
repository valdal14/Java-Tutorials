package com.valdal14.abstraction;

/**
 * -> Abstraction is used to hide the underlying
 *    implementation
 * -> We can use Abstract Classes
 * -> An Abstract class (Partial abstraction)
 *    can contain concrete and abstract methods as well
 * -> An Abstract class cannot be instanciated
 * -> Using interfaces we completely abstract the implementation
 * -> We can even define a main method inside an abstract class since
 *    it is still a static method
 * -> Abstract class cannot be final
 * -> An abstract method cannot be marked as static
 * -> Can we extend an abstract class and market it as final?
 *    Yes we can do it. However if we add a new abstract method
 *    to the BMW class we have to implement on the final child class
 */

public class TestClassAbstraction {

    public static void main(String[] args) {

        SeriesThree s3 = new SeriesThree(00011113, "S3");
        // calling the abstract method we override
        s3.accelerate(s3);
        // calling a concrete method inherited from the abstract class
        s3.carModelInfo(s3);
        s3.breakEngine(s3);
        // calling a concrete method directly from the abstract class
        BMW.BMWinfo();
    }
}
