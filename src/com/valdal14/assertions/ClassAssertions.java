package com.valdal14.assertions;

/**
 *  ASSERTIONS
 *
 *  -> Used for testing and debugging reasons
 *  -> we can use the assert keyword followed by an expression evaluated to a boolean value
 *      -> If it returns true passes otherwise it will throw a java.lang.Error -> java.lang.AssertionError
 *  -> we can also use another symtax:
 *      -> assert expression1 : expression2; (expression2 can be any data type or value or a function call
 *                                            but typically we use a String error message)
 *          --> If the first expression evaluates to false only then the second expression will be evaluated
 *              and the value will be used in the AssertionError
 *
 *  -> Assertion are disabled by default at runtime
 *  -> To enable them we have to use the java -ea MyClass wnen we run our program or in the configuration
 *      under VM arguments
 *  -> java -de to disable it
 *  -> java -esa to enable system names assertions
 *  -> java -das to disable system names assertions
 *
 *  -> We should not use assertion to check public method arguments
 *      -> Instead we should throw IllegalArgumentException class
 *  -> The only real usage of Assertions is in testing
 */
public class ClassAssertions {

    public static void main(String[] args) {

    }
}
