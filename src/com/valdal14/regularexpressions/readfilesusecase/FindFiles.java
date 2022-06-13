package com.valdal14.regularexpressions.readfilesusecase;

import java.io.*;
import java.util.regex.Pattern;

public class FindFiles {

    private static final String FILEPATH = "/home/valdal14/IdeaProjects/Java-Tutorials/src/com/valdal14/regularexpressions/readfilesusecase/";

    public static void main(String[] args) {

        // file matcher pattern
        String patternValidation = "[0-9]+[.]txt";
        File f;
        int counter = 1;
        String filename;

        do {
            filename = counter + ".txt";

            f = new File(FindFiles.FILEPATH + filename);

            if(f.exists() && Pattern.matches(patternValidation, f.getName())){
                try(FileInputStream fis = new FileInputStream(f.getAbsoluteFile())) {
                    int i;
                    // fis.read() read one chars at the time
                    while ((i = fis.read()) != -1){
                        System.out.print((char) i); // cast it into chars otherwise it will print the byte value
                    }
                    System.out.println("\n------------");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            counter += 1;

        } while (f.canRead() && Pattern.matches(patternValidation, f.getName()));


    }
}
