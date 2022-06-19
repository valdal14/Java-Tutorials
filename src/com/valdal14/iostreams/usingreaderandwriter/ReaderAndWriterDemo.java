package com.valdal14.iostreams.usingreaderandwriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// reader and writer to deal with TEXT data
public class ReaderAndWriterDemo {

    public static void main(String[] args) {

        FileReader fr = null;
        FileWriter fw = null;

        try {
            fr = new FileReader("/home/valdal14/IdeaProjects/Java-Tutorials/src/com/valdal14/iostreams/usingreaderandwriter/myFile.txt");
            fw = new FileWriter("/home/valdal14/IdeaProjects/Java-Tutorials/src/com/valdal14/iostreams/usingreaderandwriter/myFileNewCopy.txt");

            // read the data
            int ch;

            while((ch = fr.read()) != -1){
                fw.write(ch);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found Exception: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Runtime Exception: " + e.getMessage());
        } finally {
            try {
                fr.close();
                fw.close();
                System.out.println("File successfully copied!!!");
            } catch (IOException e) {
                System.out.println("Runtime Exception: " + e.getMessage());
            }

        }
    }
}
