package com.valdal14.iostreams.stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

    public static void main(String[] args) {
        String s = "You,are,the,programmer,of,this,code";
        // I want to split it into separated tokens
        StringTokenizer st = new StringTokenizer(s, ",", false);

        while (st.hasMoreTokens()){
            // invoke the next token
            System.out.println(st.nextToken());
        }
    }
}
