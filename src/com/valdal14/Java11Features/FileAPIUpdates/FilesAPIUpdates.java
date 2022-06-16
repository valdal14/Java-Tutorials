package com.valdal14.Java11Features.FileAPIUpdates;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesAPIUpdates {

    private final static String FILEPATH = "/home/valdal14/IdeaProjects/Java-Tutorials/src/com/valdal14/Java11Features/FileAPIUpdates/test.txt";

    public static void main(String[] args) throws IOException {

        // Write a String to a File
        Path path = Files.writeString(Path.of(FilesAPIUpdates.FILEPATH), "Java 11 new Files API");
        System.out.println(path);
        // Read the content of the file
        String contentOfTheFile = Files.readString(path);
        System.out.println(contentOfTheFile);
        // We can also create a temp file
        Path newTempPath = Files.writeString(Files.createTempFile("newTestFile", ".txt"), "Writing on a temp file");
        System.out.println(newTempPath);
        String contentofTempFile = Files.readString(newTempPath);
        System.out.println(contentofTempFile);

    }
}
