package com.valdal14.Java11Features.StringAPIUpdates;

import java.util.stream.Stream;

public class StringAPIUpdates {

    public static void main(String[] args) {

        // STRING API UPDATES -------------------------------------------------------------------------------

        // str.isBlank()
        var str = "          ";
        System.out.println(str.isBlank()); // true

        // str.lines()
        var newStr = "I'am \n the best programmer \n in my localhost";
        Stream<String> newStream = newStr.lines();
        newStream.forEach(System.out::println);

        // str.strip()
        char c = '\u2000'; // blank space in unicode
        String s = "I am a new string" + c + "there was not space in it";
        System.out.println(s);
        // --------------------------------------------------------------------------------------------------
    }
}
