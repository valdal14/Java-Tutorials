package com.valdal14.encapsulation;

/**
 *  ENCAPSULATION ----------------------------------
 *
 *  -> The art of hiding information :)
 *  -> We mark all the filed private and later on we define public getters and setters
 *  -> Encapsulation gives us more security and maintainability
 *  -> Encapsulation is basically abstractions and bindings
 */

public class TestClassEncapsulation {

    public static void main(String[] args) {
        Customer c = new Customer();
        c.setFirstName("Val");
        c.setLastName("Dal");
        c.setCredicCardNumber("1111-1111-1111-1111-1111");

        c.getFirstName();
        c.getLastName();
        c.getCredicCardNumber();
    }
}
