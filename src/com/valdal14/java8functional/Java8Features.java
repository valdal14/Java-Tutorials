package com.valdal14.java8functional;

/**
 *  JAVA 8 FEATURES ----------------------------------------------------------------------------------------
 *      -> Lambda Expression
 *      -> Functional Interfaces
 *      -> Default Methods
 *      -> Predicates
 *          --> Evaluate a given expression and returns a boolean results
 *      -> Functions
 *      -> Stream API
 *
 *  -> LAMBDA EXPRESSIONS:
 *      -> Their main goal is to introduce the benefits of functional programming
 *      -> A Lambda is an anonymous function or closure that does not have a name, return type and access
 *         modifier
 *      -> (String str) -> str.length;
 *      -> Easy to implement anonymous inner classe
 *      -> We can pass Lambda expressions as params to method
 *      -> We need to use Functional Interfaces to use Lambda
 *
 *  -> FUNCTIONAL INTERFACES
 *      -> If an interface has one and only one abstract method then is called functional interface
 *          --> Interface MyInterface { void myMethod(); }
 *      -> Example of built-in functional interfaces are Runnable ( run method ) and Comparator ( compareTo method)
 *      -> Starting with Java 8 we can also Default Methods to interfaces
 *          -> But only one can be Abstract
 *      -> Java 8 also provides with the annotation @FunctionalInterface
 *          -> Forces us to be sure we have only one abstract method defined in it
 *
 *  -> DEFAULT METHODS
 *      -> We can create a default method inside an interface by declaring it like below:
 *      -> public interface DefaultMethodInterface {
 *                  default void defaultMethodInterface(){
 *                  System.out.println("This is a default method of this interface");
 *              }
 *          }
 *      -> When we implement the Interface the compiler will not ask to implement it
 *      -> But we can override it if we implement the interface
 *      -> Or use it directly withing a class
 *
 *
 *   -> DIAMOND PROBLEM
 *      -> The reason multiple inheritance is not supported in Java is related to the diamond problem
 *      -> We can do multiple inheritance using Interfaces
 *      -> Now that we have default methods tho we may have a problem
 *      -> If a class implements two interfaces that have exactly the same default method we must override
 *         it to avoid compile time issue
 *
 *  -> PREDICATE
 *      -> A Predicate is a function with a single argument and return a boolean result
 *      -> To implement a Predicate we use the interface Predicate<T>
 *      -> It has only one abstract method: public boolean test(T t);
 *      -> It is a functional interface and this allows us to use lambda
 *      -> We use the predicate.test() method to use it:
 *          Predicate<Integer> predicate = (Integer num) -> num >= 20;
 *          System.out.println(predicate.test(20));
 *      -> We can pass this predicate to a method as an argument
 *      -> We can use two predicates together by joining them:
 *          --> We can use the method available in the predicate interface and those are:
 *                 ---> and()
 *                 ---> or()
 *                 ---> negate()
 *
 *   -> FUNCTION
 *      -> Like Predicate but they can Return any Type
 *      -> We use the function interface: interface Function(T,R) { return R apply(T t); }
 *      -> It has only one method called apply that can take any type and return any type as well
 *      -> It is a functional interface like the Predicate therefore we can use lambda expression with it
 *
 *   -> METHOD AND CONSTRUCTOR REFERENCE
 *      -> ::
 *      -> We can map methods and constructor to a functional interface using ::
 *      -> It can be also done using static methods
 *          -> MyInterface i = Myclass::myMeethod;
 *          -> Only method argument type must be the same
 *
 *      -> Example:
 *          MyInterface {
 *              string sayHello(String name);
 *          }
 *
 *          MyClass {
 *              // define the same method of the interface
 *              string myMethod(String name){
 *                 .....
 *              }
 *              // Mapping using ::
 *              MyClass m = newClass();
 *              MyInterface i = m::myMethod;
 *              // Now we can invoke it
 *              String s = i.sayHello("Valerio");
 *          }
 *
 *
 *        -> Constructor Reference:
 *
 *          // Using Lambda for mapping
 *         MyInterface myInterface = str -> new Myclass(str);
 *         myInterface.getString("Using Lambda");
 *
 *         // Using Constructor Mapping
 *         MyInterface myInterface1 = Myclass::new;
 *         myInterface1.getString("Constructor Reference");
 *
 *
 *  -> STREAMS
 *      -> Using Stream we can manipulate data in a declarative manner
 *      -> Very similar to SQL
 *      -> Streams make easier to process collections
 *      -> These Streams are not the same as the Java.io package
 *      -> Streams is an Interface in the java.util.stream.Stream
 *      -> We can get a Stream on a collection by invoking the stream() method
 *      -> The stream() method was added to the Collection Interface
 *      -> When we have a stream list.stream() to process a collection we will do in two phases:
 *          ---> Configuration:
 *                  ----> Filtering: public Stream filter(Predicate<T> p) -> Returns a filtered Stream
 *                  ----> Map      : public Stream map(Function f)        -> Returns a new Collection
 *          ---> Processing
 *                  ----> We can use one of the following:
 *                      ---> collect()
 *                      ---> count()
 *                      ---> sorted()
 *                      ---> min()
 *                      ---> max()
 *                      ---> reduce()
 *  --------------------------------------------------------------------------------------------------------
 */

@FunctionalInterface
interface Summable {
    Integer calculateSum(int a, int b);
}

// As soon as we add a method this is no longer a functional interface
// We can only have the same method declared in summable to keep it functional
interface Test extends Summable {
    void test();
}
public class Java8Features implements Summable {

    public static void main(String[] args) {
        // Previous Lambda interface implementation
        Java8Features java8Features = new Java8Features();
        Integer sum = java8Features.calculateSum(4,5);
        System.out.println(sum);
    }

    @Override
    public Integer calculateSum(int a, int b) {
        return a + b;
    }
}


// Using Lambda Expression
class UsingLambda {

    public static void main(String[] args) {
        Summable s = (int a, int b) -> a + b;
        Integer sum = s.calculateSum(4,5);
        System.out.println("The sum is: " + sum);

    }
}