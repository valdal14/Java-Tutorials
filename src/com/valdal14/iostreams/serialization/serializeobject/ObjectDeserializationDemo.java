package com.valdal14.iostreams.serialization.serializeobject;

import java.io.*;

public class ObjectDeserializationDemo implements Serializable {

    private static final String FILEPATH = "/home/valdal14/IdeaProjects/Java-Tutorials/src/com/valdal14/iostreams/serialization/serializeobject/employee.ser";

    public static void main(String[] args) {

        try(FileInputStream fs = new FileInputStream(FILEPATH);
            ObjectInputStream ois = new ObjectInputStream(fs)){

            // Get an Object or typecast to it
            Employee emp = (Employee) ois.readObject();
            emp.printEmployeeInfo();

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO exception: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found exception: " + e.getMessage());
        }
    }
}
