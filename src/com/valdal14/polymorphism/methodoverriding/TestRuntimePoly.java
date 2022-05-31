package com.valdal14.polymorphism.methodoverriding;
/**
 * Polymorphism ------------------------------------------------------
 *
 * -> Poly means MULTI and Morphic means SHAPES
 * -> If an object can have multiple shape is called polymorphic
 * -> In OOP the SHAPES stands for behaviour or methods
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
 */
public class TestRuntimePoly {

    public static void main(String[] args) {
        MacBook mbOne = new MacBookAir("MacBookAir");
        MacBook mbTwo = new MacBookPro("MacBookPro");

        mbOne.start(mbOne);
        mbTwo.start(mbTwo);

        mbOne.shutdown(mbOne);
        mbTwo.shutdown(mbTwo);
    }

}
