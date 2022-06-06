package com.valdal14.iostreams.countwithbrandstringtokenizer;

import java.io.*;
import java.util.StringTokenizer;

public class WordCountWithBufferReaderAndStringTokenizer {

    private static final String FILEPATH = "/home/valdal14/IdeaProjects/Java-Tutorials/src/com/valdal14/iostreams/countwithbrandstringtokenizer/";
    private static final String FILENAME = "myNewFile.txt";

    public static void main(String[] args) {

        FileReader fs = null;
        BufferedReader br = null;
        int count = 0;
        try {
            fs = new FileReader(FILEPATH.concat(FILENAME));
            br = new BufferedReader(fs);

            String line;

            while ((line = br.readLine()) != null){
                StringTokenizer st = new StringTokenizer(line);
                while (st.hasMoreTokens()){
                    // get the next token
                    System.out.println(st.nextToken());
                    count += 1;
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not fund exception: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO Exception: " + e.getMessage());
        } finally {
            try {
                System.out.println("The amount of words we process is: " + count);
                fs.close();
                br.close();
            } catch (IOException e) {
                System.out.println("IO Exception: " + e.getMessage());
            }
        }

    }
}
