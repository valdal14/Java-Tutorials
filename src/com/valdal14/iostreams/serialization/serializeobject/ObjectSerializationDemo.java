package com.valdal14.iostreams.serialization.serializeobject;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * We are going to write an Object to a file
 */
public class ObjectSerializationDemo {

    private static final String FILEPATH = "/home/valdal14/IdeaProjects/Java-Tutorials/src/com/valdal14/iostreams/serialization/serializeobject/employee.ser";

    public static void main(String[] args) {

        try(FileOutputStream fos = new FileOutputStream(FILEPATH);
            ObjectOutputStream oos = new ObjectOutputStream(fos)){

            // write the object
            oos.writeObject(new Employee(1, "Valerio", 48.000, 1234567890));
            System.out.println("Employee object serialized");

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO exception: " + e.getMessage());
        }
    }
}
