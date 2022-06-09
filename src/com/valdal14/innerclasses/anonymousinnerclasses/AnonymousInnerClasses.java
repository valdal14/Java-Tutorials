package com.valdal14.innerclasses.anonymousinnerclasses;

public class AnonymousInnerClasses {

    public static void main(String[] args) {
        Connection con1 = DriverManager.getConnection();
        Connection con2 = DriverManager.getAlternativeConnection();
        
        con1.createStatement();
        con2.createStatement();
    }
}
