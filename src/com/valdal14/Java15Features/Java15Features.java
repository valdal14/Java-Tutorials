package com.valdal14.Java15Features;

/**
 *  JAVA 15 FEATURES ---------------------------------------------------------------------------------------------
 *
 *      -> SEALED CLASSES AND INTERFACES:
 *          -> If we define a class as sealed we need subclasses
 *          -> Alternatively we can use the permits keywords to specify which subclassses are allowed to
 *             inherit from the parent
 *
 *             public sealed class BMWParent permits ThreeSeries, FiveSeries
 *
 *         -> We need to declare the child classes either sealed, final or non-sealed in order to remove
 *            compile time errors.
 *         -> RULES FOR SEALED CLASSES:
 *          -> All permitted subclasses must belong to the same module as the sealed class.
 *          -> Every permitted subclass must extend the sealed class
 *          -> Every permitted subclass must define a modifier:
 *              --> final
 *              --> sealed
 *              --> non-sealed
 *                  --> if we declared a subclass of a sealed parent non-sealed this means this subclass
 *                      can be extended by any other class
 *          -> Reflection Notes:
 *              -> The isSealed method returns true if the given class or interface is sealed
 *              -> Method getPermittedSubclasses() returns an array of objects representing all the
 *                 permitted subclasses.
 *
 *      -> RECORD PREVIEW:
 *          -> We can use annotation inside the constructor:
 *
 *             public record Doctor(String name, @DocAnnotation String role) implements Employees
 *
 *          -> We can use local records in Java 15 (inside a method)
 *
 *  --------------------------------------------------------------------------------------------------------------
 */

public class Java15Features {
}
