package com.valdal14.polymorphism.methodoverriding;
/**
 * Polymorphism ------------------------------------------------------
 *
 * -> Poly means MULTI and Morphic means SHAPES
 * -> If an object can have multiple shape is called polymorphic
 * -> In OOP the SHAPES stands for behaviour or methods
 * -> We can also use Interface as main Object to build our instance variable
 *
 * -> There are two types of Polymorphism in Java:
 *      -> Compile Time or Static Binding
 *      -> Runtime or Dynamic Binding
 *
 * -> Runtime or Dynamic Binding ///////////////////
 *      ->  We get Dynamic Binding with Method overriding
 *      -> MacBook m = new MacBookPro();
 *      -> m.start();
 *      -> Using the parent class instance to access the child methods
 *      -> This allow us to switch the implementation at runtime
 *      -> Spring uses Runtime or Dynamic Polymorphism to do dependency injections
 *      -> Remember overriding is runtime polymorphism
 *      -> Remember that if a parent class has defined a static method the children classes
 *         has to override it as a static method too
 *      -> How variables are resolved when overriding
 *          -> If we create two variables with the same data type and value in both parent and child
 *             and we use Runtime Polymorphism and we create an instance of such as:
 *             Parent c1 = Child();
 *             c1.sameVariable will be the Parent.
 *          -> This is because variable resolution will occur at compile time
 *          -> If we do the override of a method the child method will be invoked meanwhile with variables
 *             the child variable will be called. See the last line in the main method **
 *
 * -> We can override the main method from a child class and execute it directly from the child
 */
public class TestRuntimePoly {

    public static void main(String[] args) {
        MacBook mbOne = new MacBookAir("MacBookAir");
        MacBook mbTwo = new MacBookPro("MacBookPro");

        mbOne.start(mbOne);
        mbTwo.start(mbTwo);

        mbOne.shutdown(mbOne);
        mbTwo.shutdown(mbTwo);

        // We can also use Interface as main Object to build our instance variable
        // The MacBook class implemented the Interface's methods and the
        // MacBookAir being a child of the MacBook class can use it
        AppleLaptop newAppleLapto = new MacBookAir("MacBookAir");
        newAppleLapto.start();
        newAppleLapto.shutdown();

        // ** Variable in overriding
        MacBook mb1 = new MacBookAir("MacBookAir");
        MacBook mb2 = new MacBookPro("MacBookPro");
        // In the case of variable the children variable will be picked at runtime unlike method
        // Variable resolution is processed at compile time and therefore it will take the parent value
        // Meanwhile with method overriding happening at runtime the method executed will be from the child
        System.out.println(mb1.runtimePolyVariable);
        System.out.println(mb2.runtimePolyVariable);
    }

}
