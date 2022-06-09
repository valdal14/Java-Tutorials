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
 * -> If we implements two interfaces and both have the same final static variable declared we need to
 *    qualify the name of the interface for which we want to grab the value
 * -> If we have two interface with the same method name and we implement both we will only add the
 *    implementation to one of them. If they have the same name but different signature we must override
 *    both. Finally if one of them have a different return type we will get an error
 *
 */

/**
 * MARKER INTERFACE -------------------------------
 *
 * -> A Marker Interface is an interface without any methods
 * -> IE: class MyClass implement Serializable
 *      -> Clonable
 *      -> RandomAccess (ArraList class implement the RandomAccess Marker Interface)
 * -> if we implement the Serializable the object will be handled as a Stream
 */
public class TestClassInterfaces implements Car, Van {

    public static void main(String[] args) {
        Honda honda = new Honda();
        honda.go();
        honda.stop();
        // Get the constants from the interface
        String modelname = Car.MODELNAME;
        System.out.println(modelname);

        // Same variable defined in the same interface
        System.out.println(Van.MODELNAME);
    }

    @Override
    public void go() {
        System.out.println("");
    }

    @Override
    public void stop() {
        System.out.println("");
    }
}
