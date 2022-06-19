package com.valdal14.objectsclassmethods;

/**
 *  OBJECT CLASS METHODS -------------------------------------------------------------------------------------------
 *
 *  -> Every Java class implicitly extends the Object class
 *  -> And inherits different methods from it
 *  -> We have already seen wait, notify, notifyAll
 *  -> In this part we will cover toString, hashCode (very useful for some collection APIs)
 *  -> equals
 *
 *  -> toString:
 *      -> Default implementation: getClass().getName()+"@"+Integer.toHexString(hashcode())
 *      -> Only the String class overrides it to print the value of a String
 *      -> But we can override it in any class we want
 *
 *  -> hashCode: int hashCode()
 *      -> Collections such as HashMap and HastSet uses this code to store the object into buckets
 *      -> Very fas to retrieve
 *      -> Always a good practice to override the hashCode method in our classes and return a code
 *      -> If we do not the JVM will always return the memory address of the object
 *
 *  -> equals(Object)
 *      -> The equals method is used to check whether or not two objects are equal
 *      -> The default implementation used the == for equality and this will check whether or not they are
 *         in the same memory location
 *      -> String, StringBuffer and Wrapper Classes overrides it and do not check the memory location value
 *         but the actual content of the Object
 *
 *  -> equals and hashCode contract:
 *      -> The JAVA code says that "equals returns true then hashcode value must be the same"
 *  ----------------------------------------------------------------------------------------------------------------
 */
public class ObjectClassMethods {
}
