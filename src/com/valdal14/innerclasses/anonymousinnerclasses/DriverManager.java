package com.valdal14.innerclasses.anonymousinnerclasses;

public class DriverManager {

    static Connection getConnection(){
        // anonymous inner class
        return new Connection() {
            @Override
            public void createStatement() {
                System.out.println("Create a DB Connection");
            }
        };
    }

    static Connection getAlternativeConnection(){
        // same anonymous but different way of doing it
        Connection con = new Connection() {
            @Override
            public void createStatement() {
                System.out.println("Create a DB Connection");
            }
        };
        // return the anonymous inner calls Connection
        return con;
    }
}
