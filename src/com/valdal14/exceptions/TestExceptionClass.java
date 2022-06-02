package com.valdal14.exceptions;

/**
 *  EXCEPTION HANDLING ----------------------------
 *
 *  -> We only handle potential runtime exception errors
 *  -> Compile time and logic errors are handle differently
 *
 *  -> Exception is a class ad it is used by the JVM to throw
 *
 *  -> All the Exception Class in Java inherit from a class called Throwable
 *      -> Throwable has two child classes
 *          -> Exception: We can handle exception of type Exception
 *              - IOException
 *                  -- FileNotFoundException
 *              - SQLException
 *              - RuntimeException
 *                  -- ArithmeticException
 *                  -- NullPointerException
 *          -> Error: cannot be handled by our program
 *              - NoClassDefinitionFound
 *              - OutOfMemoryError
 *              - NoSuchMethodError
 *
 *      -> All the classes that inherit from Exception are called CHECKED Exceptions
 *          -> CHECKED Exception must be handled it
 *      -> All the classes that inherit from RuntimeException are called UNCHECKED Exceptions
 *
 *      -> We can handle them with using the followings:
 *          -> try - catch - throw - finally - throws
 *
 *  -> We can catch an exception using the parent Exception class
 *  -> If we have a multiple catch block but we use the parent class Exception
 *     to hadle the first the others will produce a compile time error since
 *     the exception is already handled by the parent
 *
 * -> We should always prefer single and specified exceptions instead of using the super class UNCHECKED Exception
 *
 * -> We can also create custom CHECKED and UNCHECKED exceptions
 */

public class TestExceptionClass {

    public static void main(String[] args) {

    }
}
