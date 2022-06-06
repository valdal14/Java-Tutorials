package com.valdal14.iostreams.trywithresources;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class TryWithResources {

    private static final String FILEPATH = "/home/valdal14/IdeaProjects/Java-Tutorials/src/com/valdal14/iostreams/trywithresources/";
    private static final String FILENAME = "myNewFile.txt";

    public static void main(String[] args) {

        // Try with Resources we do not need to close the streams
        try(FileReader fr = new FileReader(FILEPATH.concat(FILENAME))){

            int  line;

            while ((line = fr.read()) != -1){
                System.out.println((char) line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO error: " + e.getMessage());
        }
    }
}
