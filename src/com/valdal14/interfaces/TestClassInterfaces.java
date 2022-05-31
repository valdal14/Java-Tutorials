package com.valdal14.interfaces;

/**
 * INTERFACES --------------------------------
 *
 * -> The compiler will automatically mark every method we declare as public and abstract
 * -> Interface method cannot be concrete but all abstract, we cannot provide the implementation like
 *    in an abstract class
 *
 * -> Interfaces vs Abstract Classes -------------
 * -> An interface is a contract while an abstract class is a partial implementation
 * -> All interface methods are abstract while abstract classes are not
 * -> An interface by default is public abstract
 * -> Variables in an interface are public static final (CONSTANTS) while in an abstract they are not
 * -> Variable in an interface being constants must be initialized while in an abstract we do not need
 * -> Interfaces cannot define Blocks while an abstract class can define blocks
 * -> Interface do not have a constructor while an abstract class can have it
 *
 *
 */
public class TestClassInterfaces {

    public static void main(String[] args) {
        Honda honda = new Honda();
        honda.go();
        honda.stop();
        // Get the constants from the interface
        String modelname = Car.MODELNAME;
        System.out.println(modelname);
    }
}
