package com.valdal14.exceptions;

public class NullPointerExample {

    static TestExc classtest;

    public static void main(String[] args) {

        try {
            // This will happen because we did not create an instance of the TestExc class
            NullPointerExample.classtest.testExc();
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("The app will be terminated!!!");
        }
    }
}

class TestExc {
    public void testExc(){
        System.out.println("testing a null pointer exception");
    }
}
