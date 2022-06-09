package com.valdal14.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class UsingThrows {

    public static void main(String[] args) {

        UsingThrows ut = new UsingThrows();
        try {
            ut.readFile();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    // Now we use the throws keyword at the method signature
    private void readFile() throws FileNotFoundException {
        String filename = "C:/test.txt";
        FileInputStream fi = new FileInputStream(filename);
    }
}
