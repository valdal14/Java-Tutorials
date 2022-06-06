package com.valdal14.iostreams.readfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// Read a File (BINARY DATA)
public class FileInputStreamDemo {

    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(new File("/home/valdal14/IdeaProjects/Java-Tutorials/src/com/valdal14/iostreams/readfile/myFile.txt"));
            System.out.println("File Opened");
            int i;
            // fis.read() read one chars at the time
            while ((i = fis.read()) != -1){
                System.out.print((char) i); // cast it into chars otherwise it will print the byte value
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
            e.printStackTrace(); // print all the stack exception
        } catch (IOException e) {
            System.out.println("IO Exception: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                System.out.println("IO Exception: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
