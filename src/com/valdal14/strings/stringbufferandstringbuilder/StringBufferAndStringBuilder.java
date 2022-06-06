package com.valdal14.strings.stringbufferandstringbuilder;

/**
 * STRING BUFFER AND STRING BUILDER ---------------------------------------------------------------------
 *
 * -> String Buffer is not immutable
 * -> The SB will not be created in the String Pool
 */

public class StringBufferAndStringBuilder {

    public static void main(String[] args) {
        // String Buffer
        StringBuffer sb = new StringBuffer();
        // print the current capacity of the SB
        System.out.println("Initial capacity: " + sb.capacity());
        // add data - not immutable and does not return values
        sb.append("Hello World");
        sb.append(" We can append anything");
        System.out.println("Initial capacity: " + sb.capacity());

        // Check for equality
        String s = new String("Hello World We can append anything"); // this will go into the String Pool
        System.out.println("--- EQUALITY WITH SB AND STRING() ---");
        System.out.println(sb.toString() == s); // check Equality in memory --> false
        System.out.println(sb.toString().equals(s)); // check Equality in the value --> true

        // SB methods
        // This will mutate the String
        System.out.println(sb.reverse());
        sb.insert(sb.length(), " At the end of this buffer");
        System.out.println(sb.toString());

        sb.delete(10, sb.length());
        System.out.println(sb.reverse().toString());
    }
}
