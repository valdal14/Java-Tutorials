package com.valdal14.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *  JAVA REGULAR EXPRESSIONS ----------------------------------------------------------------------------------------
 *      -> Allows us to created regex pattern to match Group of Strings
 *      -> Regex are mostly used for:
 *          --> Validations
 *          --> Pattern Matching
 *          --> Translators, Compilers, Interpreters
 *          --> Digital Circuits
 *          --> TCP/UDP
 *      -> We have two important classes
 *          --> java.util.regex.Matcher
 *          --> java.util.regex.Pattern
 *      -> The String class already provides a Matches pattern implemented
 *
 *      -> Regex Character Classes
 *          --> [xyz]           --> Either x or y or z
 *          --> [^xyz]          --> Any other than x y z
 *          --> [a-z]           --> Any chars from small a to small z
 *          --> [A-Z]           --> Any chars from big A to big Z
 *          --> [a-zA-Z]        --> Any chars from small a to small z OR Any chars from big A to big Z
 *          --> [0-9]           --> Any nums between 0 and 9
 *          --> [a-zA-Z0-9]     --> Any chars from small a to small z OR Any chars from big A to big Z OR nums from 0 to 9
 *          --> [^a-zA-Z0-9]    --> Anything other than Any chars from small a to small z OR Any chars from big A to big Z or nums from 0 to 9
 *       -> Meta Characters
 *          --> \s              --> matches the space character
 *          --> \d [0-9]        --> matches any digit from 0 to 9 (instead of using [0-9])
 *          --> \w [a-zA-Z0-9]  --> matches alpha-numeric values (instead of using [a-zA-Z0-9] )
 *          --> .               --> matches all the special characters
 *          --> \S              --> Any character EXCEPT the space character
 *          --> \D              --> Any character EXCEPT any digit from 0 to 9 (instead of using [0-9])
 *          --> \W              --> Any character EXCEPT alpha-numeric values (instead of using [a-zA-Z0-9] )
 *       -> Quantifiers
 *          --> X-              --> X can occur only once
 *          --> X?              --> X can occur 0 or 1 time
 *          --> X+              --> X can occur 1 or more than once (at least once)
 *          --> X*              --> X can occur 0 or more times
 *  -----------------------------------------------------------------------------------------------------------------
 */

public class RegularExpressions {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("abc");
        Matcher matcher = pattern.matcher("abcdefghiabclmnopqrstabcuvwyzabe");
        while (matcher.find()){
            System.out.println(matcher.start()); // index start
            System.out.println(matcher.end());   // index end
            System.out.println(matcher.group()); // group the matching pattern
            System.out.println("-------------");
        }

        // Email Validation
        String email = "valdal@gmail.com";
        if(email.matches("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$")){
            System.out.println("valid email");
            System.out.println("-------------");
        } else {
            System.out.println("invalid email");
        }

        // Example
        /**
         * Any chars from small a to small z OR Any chars from big A to big Z
         * a space
         * a - char
         * any number
         *
         * I.E: "valerio - 14"
         */
        String patternValidation = "([a-zA-Z]+\\s)-?\\s([0-9]+)";
        System.out.println(Pattern.matches(patternValidation, "valerio - 14"));
    }
}
