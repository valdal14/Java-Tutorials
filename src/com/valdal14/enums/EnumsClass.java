package com.valdal14.enums;

import java.util.Arrays;

/**
 * ENUMS --------------------------------------------------------------------------------------------------------
 * -> Used to represent a group of named constants in our applications
 * -> Internally an Enum is represented as a class
 * -> Everything inside it is an Object or a Reference to that particular Enum
 *      --> Automatically they PUBLIC STATIC FINAL
 * -> Every Enum internally extends an Abstract class called Enum from java.lang and we cannot extends any
 *    other classes but implements any other interfaces
 * -> The toString method is already overridden and therefore we will see the name of the constant
 * -> The Enum class that the Enum extends give us access to some useful methods such as
 *      --> SupportedPayments.values() returns an Array
 *      --> p.ordinal() return the index
 * -> Since an Enum internally is a Java class we can create fields, constructors and methods
 *      --> if we create a constructor with fields we need to specify the value for each constants
 *          otherwise we need to write a default constructor (See the Payment and Database differences)
 * --------------------------------------------------------------------------------------------------------------
 */
public class EnumsClass {

    public static void main(String[] args) {

        SupportedPayments pt = SupportedPayments.PAYPALY;
        System.out.println(pt);
        // SupportedPayments.values() -----------------------------------------
        SupportedPayments[] payments = SupportedPayments.values();
        for (SupportedPayments p : payments) {
            System.out.println(p);
            System.out.println(p.ordinal());
            // get fees
            System.out.println(p.getFee());
        }
        // --------------------------------------------------------------------

        SupportedDatabases supportedDatabases[] = SupportedDatabases.values();
        for (SupportedDatabases supDb: supportedDatabases) {
            System.out.printf("DATABASE: %s - VERSION: %f \n",supDb, supDb.getDriverversion());
        }
    }
}
enum SupportedPayments {
    PAYPALY, DEBITCARD, CREDITCARD;

    int fee;

    SupportedPayments(int fee){
        this.fee = fee;
    }

    SupportedPayments(){}

    public int getFee(){
        return this.fee;
    }

}

enum SupportedDatabases {
    MYSQL(14.5), ORACLE(19.2), NOSQL(3.0);

    double driverversion;

    SupportedDatabases(double driverversion) {
        this.driverversion = driverversion;
    }

    public double getDriverversion(){
        return this.driverversion;
    }
}
