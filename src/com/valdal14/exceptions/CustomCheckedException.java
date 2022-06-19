package com.valdal14.exceptions;

/**
 * CHECKED CUSTOMER EXCEPTION need to extend Exception
 */

public class CustomCheckedException extends Exception{

    public CustomCheckedException(String message){
        super(message);
    }
}

class TestCustomerCheckedException {
    public static void main(String[] args) {
        try {
            throw new CustomCheckedException("Business Exception that needs to handled");
        } catch (CustomCheckedException e) {
            throw new RuntimeException(e);
        }
    }
}