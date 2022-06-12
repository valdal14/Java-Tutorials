package com.valdal14.reflection.ReflectionAssignment;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionAssignment {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        // Load a class into memory
        Class<?> myClass = Class.forName(Calc.class.getName());
        // Create a constructor with arguments
        Constructor<?> constructor = myClass.getConstructor(double.class, double.class);
        // Create a new instance
        Object myObj = constructor.newInstance( 7, 7.14);
        // Get the getter values
        Method getterOne = myClass.getMethod("getNum1", null);
        Method getterTwo = myClass.getMethod("getNum2", null);
        // invoke the getters
        Object v1 = getterOne.invoke(myObj, null);
        Object v2 = getterTwo.invoke(myObj, null);
        // invoke the sum method
        Method sum = myClass.getMethod("add", double.class, double.class);
        Object result = sum.invoke(myObj, v1, v2);
        // print the result
        System.out.printf("The sum of %.2f and %.2f is: %.2f", v1, v2, result);

    }
}
