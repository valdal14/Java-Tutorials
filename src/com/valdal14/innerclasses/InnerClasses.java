package com.valdal14.innerclasses;

public class InnerClasses {

    /**
     *  INNER CLASSES -------------------------------------------------------------------------------------------
     *
     *  -> A non-static Inner class inside an Outer class cannot be instanciated direcly inside a static method
     *  -> java: non-static variable this cannot be referenced from a static context
     *
     *  public static void main(String[] args) {
     *         OuterClass outerClass = new OuterClass();
     *         outerClass.f1();
     *         // Instance of a non-static inner class inside a static method
     *         OuterClass.Inner inner = outerClass.new Inner();
     *         inner.f2();
     *     }
     * -> We cannot define static method inside a non-static Inner class becuase we cannot have static inside
     *    a non-static area in Java
     *
     * -> How to access members of the Outer class from an inner class: OuterClassDemo.this.y
     *
     *     public void f3(){
     *             // if a variable is a class variable
     *             System.out.println("Inner f3() method accessing outerclass non-static variable "  + OuterClassDemo.this.y);
     *             // we can also access to method in the outerclass
     *             OuterClassDemo.this.f1();
     *         }
     *
     *  -> LOCAL INNER CLASS:
     *      -> It is a class we create inside a Block, Method or Constructor
     *
     *      public OuterClassExample() {
     *         class LocaInnerConsructorClass {
     *             void f4(){
     *                 System.out.println("Calling a method from a LocalInner class inside a constructor of an outer class");
     *             }
     *         }
     *
     *         LocaInnerConsructorClass locaInnerConsructorClass = new LocaInnerConsructorClass();
     *         locaInnerConsructorClass.f4();
     *     }
     *
     *     // method
     *     public void f1(){
     *         System.out.println("Insider OuterClass f1() method");
     *         // This class can be accessed only inside this method
     *         class LocalInner {
     *             void f2(){
     *                 System.out.println("LocalInner class method call f2() inside outer method f1()");
     *             }
     *         }
     *
     *         // To invoke the f2() method we can only do it from here
     *         LocalInner li = new LocalInner();
     *         li.f2();
     *     }
     *
     *     // block
     *     static  {
     *         class LocalInnerStaticClass {
     *             void f3(){
     *                 System.out.println("Calling a non-static method of a LocalInner class from a static block");
     *             }
     *         }
     *
     *         LocalInnerStaticClass localInnerStaticClass = new LocalInnerStaticClass();
     *         localInnerStaticClass.f3();
     *
     *     }
     *
     *
     *  -> ANONYMOUS INNER CLASSES: ---------------------------------------------------------------------------------
     *      -> Similar to Local Inner Classes but defined inside a Method
     *      -> We can implement an Interface with its original Identity
     *      -> We cannot define a constructor because the anonymous inner class does not have the class keyword
     *      -> Example:
     *          --> Connection con = DriverManager.getConnection();
     *          (Connection Interface) = (DriverManager class and static method)
     *          --> The DriverManager will implement the getConnection() method from the Anonymous Inner class
     *              that implements the Connection interface
     *  -------------------------------------------------------------------------------------------------------------
     */
}
