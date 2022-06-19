package com.valdal14.JVM.MultipleInstances;

import java.lang.reflect.Method;

public class MultipleInstances {

    public static void main(String[] args) throws ClassNotFoundException {

        User u1 = new User();
        // Get the class that represent the u1 instance
        Class c1 = u1.getClass();

        User u2 = new User();
        Class c2 = u2.getClass();

        // Even if we have two instances, both points to the same memory object
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        // Comparing the reference in memory too
        System.out.println(c1 == c2);

        // 1175962212
        // 1175962212
        // true

        // Display the class loader info a class:
        //  --> User is our own class and therefore it will be AppClassLoader
        System.out.println(c1.getClassLoader()); // jdk.internal.loader.ClassLoaders$AppClassLoader@251a69d7
        // String instead is a built-in class and it will be loaded by the Bootstrap Class Loader under the
        // JRE -> lib -> rt.jar
        System.out.println(String.class.getClassLoader()); // null

    }

    static class User {

        public String getName(){
            return "Val";
        }

        public String getEmail(){
            return "val@gmail.com";
        }
    }
}
