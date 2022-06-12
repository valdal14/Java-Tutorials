package com.valdal14.reflection.Annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionAndAnnotationDemo {

    public static void main(String[] args) {

        // Load the class
        Class myCalc;

        try {
            // Load the class
            myCalc = Class.forName(Calculator.class.getName());
            // Create a new instance
            Constructor<?> constructor = myCalc.getConstructor(double.class, double.class);
            Object myObj = constructor.newInstance(14, 7);
            // Get the list of the annotation in this class
            // We need first to first get the method with the annotation
            Method add = myCalc.getMethod("add", double.class, double.class);
            // Let's use the method to get the annotation
            Annotation methodAnnotation = add.getAnnotation(CalculatorAnnotation.class);
            System.out.println(methodAnnotation.annotationType());
            // Get the annotation value declared in the method
            // We need to type-cast to our CalculatorAnnotation
            CalculatorAnnotation calculatorAnnotation = (CalculatorAnnotation) methodAnnotation;
            // Now we can access the values
            System.out.println(calculatorAnnotation.value1());
            System.out.println(calculatorAnnotation.value2());

            // We can also directly create an instance doing so
            Class c = Class.forName(Calculator.class.getName());
            Object myNewObj = Calculator.class.getConstructor(double.class, double.class).newInstance(12,13);
            Method addMethod = myNewObj.getClass().getMethod("add", double.class, double.class);
            Object res = addMethod.invoke(myNewObj, 15, 15);
            System.out.println(res);

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
