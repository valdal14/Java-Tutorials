package com.valdal14.reflection;

/**
 *  REFLECTION API -------------------------------------------------------------------------------------------------
 *      -> It is an API to inspect and modify the runtime behaviour of a class dynamically
 *      -> Using this API we can create an Object and invoke its methods at runtime and even change private fields
 *         values without using setter methods
 *      -> JUnit, Spring, Hibernate and Servers uses reflection API
 *          -> For instance JUnit lookup for all method marked as @Test and it will execute those methods
 *          -> Spring as DI Framework check if two classes depends on each other Spring can create the instance
 *             of the dependent classes using reflections and it will inject them into the class that needs them
 *      -> If we create custom Annotations in our code that we want to access at runtime we can use reflection and
 *         write custom code that should be executed when those annotations are processed at runtime
 *
 *      -> REFLECTION API KEY CLASSES ============================================================================
 *          -> Every class is loaded into JVM in the method area is a java.lang.Class
 *          -> This class has all the reflection methods
 *              --> java.lang.reflect.Constructor  --> Returns an Array of Constructors
 *              --> java.lang.reflect.Method
 *              --> java.lang.reflect.Field
 *              --> java.lang.reflect.Annotation
 *      ==========================================================================================================
 *
 *      -> 1 Step: LOAD A CLASS INTO MEMORY ======================================================================
 *          -> // Load a class using reflection
 *             Class<?> calculator = Class.forName("com.valdal14.reflection.FirstStepLoadClass.Calculator");
 *             // Or we can use the Class.class.getName() method
 *             Class<?> c = Class.forName(Calculator.class.getName());
 *
 *             // Get all the methods inside the calculator class
 *             Method[] methods = calculator.getDeclaredMethods();
 *
 *             for (Method m : methods) {
 *                 System.out.println(m);
 *             }
 *
 *             // We can also access a method directly without an instance
 *             Method add = c.getMethod("add", double.class, double.class);
 *             // We need to pass an instance of an Object and the params it is expecting
 *             // In this case I am passing the instance I created above of the calculator class
 *             Object newObj = add.invoke(newCalc, 12,14);
 *             System.out.println("the sum is: " + newObj);
 *
 *      ==========================================================================================================
 *
 *      -> 2 Step : CREATE AN OBJECT =============================================================================
 *          -> Constructor<?> defaultConstructorNoArguments = c.getConstructor();
 *             Object calc = defaultConstructorNoArguments.newInstance();
 *
 *          -> Create an object with fields
 *          -> Constructor<?> constructorWithParams = c.getConstructor(double.class, double.class);
 *             constructorWithParams.newInstance(14.2, 14.4);
 *             // Cast the newInstance() to our Calculator Object
 *             Calculator newCalc = (Calculator) constructorWithParams.newInstance(14.2, 14.4);
 *             // invoke the methods and getters
 *             double res = newCalc.add(newCalc.getNum1(), newCalc.getNum2());
 *             System.out.println("The sum is: " + res);
 *
 *          -> // We can also directly create an instance doing so
 *             Class c = Class.forName(Calculator.class.getName());
 *             Object myNewObj = Calculator.class.getConstructor(double.class, double.class).newInstance(12,13);
 *             Method addMethod = myNewObj.getClass().getMethod("add", double.class, double.class);
 *             Object res = addMethod.invoke(myNewObj, 15, 15);
 *             System.out.println(res);
 *
 *          -> If we want to clone an object we can use the clone method
 *             User u = new User();
 *             User u1 = (User) u.clone();
 *
 *          -> We can also use serialization and deserialization to get back an object
 *          -> Lastly some in-built classes support Factory Method
 *             DateFormat d = DateFormat.getInstance();
 *      ==========================================================================================================
 *
 *      -> ACCESSING PRIVATE FIELDS ==============================================================================
 *          // Accessing private fields instead of accessing using setter
 *         System.out.println("--- PRIVATE FIELDS ---");
 *         Field privateField1 = myClass.getDeclaredField("num1");
 *         Field privateField2 = myClass.getDeclaredField("num2");
 *         System.out.println(privateField1.getName());
 *         System.out.println(privateField2.getName());
 *         // make it public
 *         privateField1.setAccessible(true);
 *         privateField2.setAccessible(true);
 *         // now we can set the value
 *         privateField1.set(myObj, 80);
 *         privateField2.set(myObj, 18);
 *         // to get them back we need to create two new Methods and use the getNum1 and getNum2
 *         Method newGetNum1 = myClass.getMethod("getNum1", null);
 *         Method newGetNum2 = myClass.getMethod("getNum2", null);
 *         // to get them back we need to created
 *         Object newValue1 = newGetNum1.invoke(myObj, null);
 *         Object newValue2 = newGetNum2.invoke(myObj, null);
 *         // verify we changed them
 *         System.out.println(newValue1);
 *         System.out.println(newValue2);
 *         // invoke the add method again
 *         Method lastSum = myClass.getMethod("add", double.class, double.class);
 *         Object lastResult = lastSum.invoke(myObj, newValue1, newValue2);
 *         System.out.printf("The sum of %.2f and %.2f is %.2f", newValue1, newValue2, lastResult);
 *      ==========================================================================================================
 *
 *      -> REFLECTION API ANF ANNOTATIONS ========================================================================
 *          -> We need an annotation that can be accessed at runtime
 *              --> @Retention(RetentionPolicy.RUNTIME)
 *          -> If the annotation is a class level annotation we can use the method:
 *              --> myCalc.getAnnotations();
 *          -> If the annotation is a method level annotation we need to use:
 *              --> Annotation methodAnnotation = add.getAnnotation(CalculatorAnnotation.class);
 *
 *          ->     @CalculatorAnnotation
 *                 public double add(double num1, double num2){
 *                      return num1 + num2;
 *                 }
 *
 *      ==========================================================================================================
 *
 *
 *  ----------------------------------------------------------------------------------------------------------------
 */

public class ReflecationAPI {
}
