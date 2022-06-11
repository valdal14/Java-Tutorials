package com.valdal14.JVM.loadingClasses;

import java.lang.reflect.Method;

public class TestLoaderClass {

    public static void main(String[] args) {

        // Dynamically load a class in memory
        try {
            Class c = Class.forName("com.valdal14.JVM.loadingClasses.User");
            // Returns an Array of Method available in the class (reflection)
            Method[] methods = c.getDeclaredMethods();

            // Numbers of methods in the class
            System.out.printf("This class has %d methods available \n", methods.length);

            for (Method method: methods) {
                // method.getName() returns the name of the available methods
                System.out.println(method.getName());
                // check the return type of a method
                System.out.println(method.getReturnType());
            }

        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException: " + e.getMessage());
        }
    }
}
