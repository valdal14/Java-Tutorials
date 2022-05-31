package com.valdal14.polymorphism.methodoverloading;

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
 * -> Compile Time or Static Binding //////////////
 *      -> We get Static Binding with Method overloading
 *      -> Multiple methods with the same name but different signatures
 *      -> The compiler at compile time decide with method should be executed by the JVM
 */
public class TestCompiletimePoly {

    public static void main(String[] args) {
        CompileTimeOrStaticBindingPoly poly = new CompileTimeOrStaticBindingPoly();
        poly.add(1,2,3);
    }
}
