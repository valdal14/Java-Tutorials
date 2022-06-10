package com.valdal14.java8functional.methodreferencing.constructors;

public class NewClassTestConstructor {

    public static void main(String[] args) {

        // Using Lambda for mapping
        MyInterface myInterface = str -> new Myclass(str);
        myInterface.getString("Using Lambda");

        // Using Constructor Mapping
        MyInterface myInterface1 = Myclass::new;
        myInterface1.getString("Constructor Reference");
    }
}
