package com.valdal14.generics;

/**
 *  JAVA GENERICS ------------------------------------------------------------------------------------------------
 *
 *      -> Introduced in Java 1.5 and they were introduced to provide Type Safety and avoid Type Casting with
 *         Java Collections
 *      -> Generics in Java are compile time not runtime. This is becuase of a concept knows as "Type Erasure"
 *      -> Type Erasure means that the compiler will use the Type we specified <String> to be sure we are
 *         going to use the right data type.
 *      -> When JVM has done with the check it will remove the Type (<String> will be gone)
 *      -> At runtime will not be available and this is why we detect generics type issue at compile time
 *      -> This is done for backward compatibility
 *
 *      -> class ArrayList<T> {
 *              add(T t);
 *              T get(ont index);
 *         }
 *
 *      -> Get the Object info this.obj.getClass().getName()
 *      -> public void displayObjInfo(){
 *              System.out.println("Type of object is: " + this.obj.getClass().getName());
 *         }
 *
 *      -> We can also specify multiple T types in a class
 *
 *      -> Restricting Generic Types
 *          -> When we create a Generic class we can restrict the T type itself
 *          -> In the genericsclass demo we used String and Integer
 *          -> AnyRunnable<T extends Runnable>
 *              --> We are saying restrict this only to Type that extends the Runnable Interface
 *              --> We can restrict using either an Interface or a Parent class
 *              --> We can also use multiple types to restrict
 *                  ---> class MyRunnable<T extends Thread&Comparable>{}
 *                  ---> With this Signature we are forced to pass a Class that extend the Thread Class
 *                       as well as that implements the Comparable Interface
 *
 *      -> Generics Methods with Wildcards
 *          -> public void mymethod(ArrayList<?> list){}
 *              --> ? wildcard allows only NULL values to be inserted inside the method itself
 *          -> We can also use Wildcards and Extends
 *              --> public void myNewMethod(ArrayList<? extends Thread> l)
 *                  --> Bear in mind that we cannot add directly inside the method l.add(new Thread());
 *                      This is not allowed. Please refer to the package wildcardparams
 *
 *          -> public void  myNewMethod(ArrayList<? super B> list){
 *              list.add(null);
 *              // now we can add the child class B that extends A
 *              list.add(new B()); // no compile time issue
 *             }
 *
 *      -> We can also define generics type params at method level
 *          -> We can define the type T anywhere in the body of the method
 *          -> We can also use restrictions and wild cards
 *
 *  --------------------------------------------------------------------------------------------------------------
 */
public class JavaGenerics {
}
