package com.valdal14.reflection.FirstStepLoadClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class LoadClass {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {

        // Load a class using reflection
        Class<?> myClass = Class.forName(Calculator.class.getName());

        // print the class name we just loaded
        System.out.println("--- CLASS NAME LOADED ---");
        System.out.println(myClass.getName());

        // Get all the Constructors in the Calculator class
        System.out.println("--- GET ALL CONSTRUCTORS ---");
        Constructor<?>[] constructors = myClass.getConstructors();

        for (Constructor<?> constructor: constructors) {
            System.out.println(constructor);
            System.out.println(Arrays.toString(constructor.getParameterTypes()));
        }

        // Get all the variables in the Calculator class
        System.out.println("--- GET ALL FIELDS ---");
        Field[] vars = myClass.getDeclaredFields();

        for (Field v : vars) {
            System.out.println(v.getName());
        }

        // Get a default constructor and create an Object
//        System.out.println("--- DEFAULT CONSTRUCTOR ---");
//        Constructor<?> defaultConstructorNoArguments = myClass.getConstructor();
//        Object calc = defaultConstructorNoArguments.newInstance(); // no params since it is a default
//        System.out.println(calc);

        // Get the constructor with fields
        System.out.println("--- CONSTRUCTOR WITH PARAMS ---");
        // takes two double
        Constructor<?> constructorWithParams = myClass.getConstructor(double.class, double.class);
        // cast the return object to our calculator class
        Object myObj = constructorWithParams.newInstance(14.2, 14.4);
        
        // We can also access a method directly without an instance
        System.out.println("--- ACCESSING A SPECIFIC METHOD WITH PARAMS ---");
        Method add = myClass.getMethod("add", double.class, double.class);
        // We need to pass an instance of an Object and the params it is expecting
        // In this case I am passing the instance I created above of the calculator class
        Object newObj = add.invoke(myObj, 12,14);
        System.out.println("the sum is: " + newObj);

        // Invoke the getters
        System.out.println("--- INVOKE THE GETTERS ---");
        Method getterOne = myClass.getMethod("getNum1", null);
        Method getterTwo = myClass.getMethod("getNum2", null);

        Object g1 = getterOne.invoke(myObj, null);
        Object g2 = getterTwo.invoke(myObj, null);

        System.out.println("Getter getNum1 returned: " + g1);
        System.out.println("Getter getNum2 returned: " + g2);

        // invoke the setters
        System.out.println("--- INVOKE THE SETTERS AND ADD METHOD ---");

        Method setterOne = myClass.getMethod("setNum1", double.class);
        Method setterTwo = myClass.getMethod("setNum2", double.class);

        setterOne.invoke(myObj, 20);
        setterTwo.invoke(myObj, 20);

        System.out.println("var num1 is: " + g1);
        System.out.println("var num2 is: " + g2);

        Method addNums = myClass.getMethod("add", double.class, double.class);
        Object newSum = addNums.invoke(myObj, g1, g2);

        System.out.println("The new sum is: " + newSum);

        // Accessing private fields instead of accessing using setter
        System.out.println("--- PRIVATE FIELDS ---");
        Field privateField1 = myClass.getDeclaredField("num1");
        Field privateField2 = myClass.getDeclaredField("num2");
        System.out.println(privateField1.getName());
        System.out.println(privateField2.getName());
        // make it public
        privateField1.setAccessible(true);
        privateField2.setAccessible(true);
        // now we can set the value
        privateField1.set(myObj, 80);
        privateField2.set(myObj, 18);
        // to get them back we need to create two new Methods and use the getNum1 and getNum2
        Method newGetNum1 = myClass.getMethod("getNum1", null);
        Method newGetNum2 = myClass.getMethod("getNum2", null);
        // to get them back we need to created
        Object newValue1 = newGetNum1.invoke(myObj, null);
        Object newValue2 = newGetNum2.invoke(myObj, null);
        // verify we changed them
        System.out.println(newValue1);
        System.out.println(newValue2);
        // invoke the add method again
        Method lastSum = myClass.getMethod("add", double.class, double.class);
        Object lastResult = lastSum.invoke(myObj, newValue1, newValue2);
        System.out.printf("The sum of %.2f and %.2f is %.2f", newValue1, newValue2, lastResult);


    }
}
