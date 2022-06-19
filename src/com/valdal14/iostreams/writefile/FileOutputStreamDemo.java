package com.valdal14.iostreams.writefile;

import java.io.*;

// Write a file (BINARY DATA)
public class FileOutputStreamDemo {
    private static final String OLDPATH = "/home/valdal14/IdeaProjects/Java-Tutorials/src/com/valdal14/iostreams/writefile/Pic-Profile.png";
    private static final String NEWPATH = "/home/valdal14/IdeaProjects/Java-Tutorials/src/com/valdal14/iostreams/writefile/vd14.png";

    public static void main(String[] args) {
        // We first need to read the file
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            // input
            fis = new FileInputStream(OLDPATH);
            // output
            fos = new FileOutputStream(NEWPATH);

            int data;

            while ((data = fis.read()) != -1){
                fos.write(data);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File Not found Exception: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO Exception : " + e.getMessage());
        } finally {
            try {
                fis.close();
                fos.close();
                System.out.println("Image successfully copied: " + FileOutputStreamDemo.NEWPATH);
            } catch (IOException e) {
                System.out.println("IO Exception : " + e.getMessage());
            }
        }
    }
}
