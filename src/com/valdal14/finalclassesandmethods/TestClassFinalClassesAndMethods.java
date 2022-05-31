package com.valdal14.finalclassesandmethods;

/**
 * FINAL CLASSES AND METHODS ---------------------------
 *
 * -> The Final access modifier can be applied to:
 *      -> class
 *      -> variable
 *      -> method
 *
 * -> If you mark a class as Final it cannot be extended or inherited
 * -> If you mark a variable as Final it cannot be changed
 * -> If you mark a method as Final it cannot be overridden by a child class
 */

public class TestClassFinalClassesAndMethods {
    public static void main(String[] args) {
        // A Final class can be instanciated but not reassigned
        final SuperClass superClass = new SuperClass();
        /**
         * public class ChildClass extends SuperClass
         *
         * -> The ChildClass cannot extend a Final Super Class
         */
        // A final variable cannot be changed
        // Not even a setter will be suggested by IDEA
        String className = superClass.className;
        System.out.println(className);
        // If we mark a instance variable as final we cannot re-assign it
        // superClass = new SuperClass();

        // 'myMethod()' cannot override 'myMethod()' in 'com.valdal14.finalclassesandmethods.FinalMethod';
        // overridden method is final
    }
}
