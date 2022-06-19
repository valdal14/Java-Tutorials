package com.valdal14.exceptions;

/**
 * CUSTOMER UNCHECKED EXCEPTION
 *
 * -> To create a custom UNCHECKED Exception we need to extend RuntimeException class
 * -> An UNCHECKED exception does not need to be handled. At compile time we will not see
 *    any sign of handling it
 */

public class CustomUncheckedException extends RuntimeException {

    public  CustomUncheckedException(String message){
        super(message);
    }
}

class TestUncheckedException {

    public static void main(String[] args) {
        throw new CustomUncheckedException("Business UNCHECKED RuntimeException that does not need to be handled");
    }
}