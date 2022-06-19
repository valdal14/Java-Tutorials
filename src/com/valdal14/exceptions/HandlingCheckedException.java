package com.valdal14.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class HandlingCheckedException {

    public static void main(String[] args) {
        String filename = "C:/test.txt";
        try {
            FileInputStream fi = new FileInputStream(filename);
        } catch (FileNotFoundException e){
            System.out.println("File not found " + e.getMessage());
        } finally {
            System.out.println("The program execution is done!!");
        }

    }
}
