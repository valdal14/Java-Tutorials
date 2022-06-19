package com.valdal14.reflection.AnnotationsAndReflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestAnnotationAndReflection {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        // Invoke a private method and handle the logic based on the annotation
        Class<?> myClass = Class.forName(TestAnnotationAndReflection.class.getName());
        Constructor<?> constructor = myClass.getConstructor();
        Object myObj = constructor.newInstance();
        // change from add to sum to see the changes
        Method method = myClass.getDeclaredMethod("add", double.class, double.class);
        // set the method accessible
        method.setAccessible(true);
        // check if the method is annotated
        if(method.isAnnotationPresent(Summable.class)){
            Annotation annotation = method.getAnnotation(Summable.class);
            // We need to type-cast to our Summable to get the value
            Summable summable = (Summable) annotation;
            double v1 = summable.value1();
            double v2 = summable.value2();
            Object res = method.invoke(myObj, v1, v2);
            System.out.println("The sum is: " + res);
        } else {
            double res = TestAnnotationAndReflection.add(7,7);
            System.out.println("The sum is: " + res);
        }
    }

    @Summable(value1 = 14, value2 = 7)
    private static double add(double a, double b){
        return a + b;
    }

    private static double sum(double a, double b){
        return a + b;
    }
}
