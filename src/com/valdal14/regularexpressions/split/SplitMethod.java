package com.valdal14.regularexpressions.split;

import java.util.regex.Pattern;

public class SplitMethod {

    public static void main(String[] args) {
        // splitting by spaces using the meta char "\\"
        Pattern pattern = Pattern.compile("\\s");
        // The Pattern and the String class have a method called split
        String[] words = pattern.split("how are you");
        for (String w: words) {
            System.out.println(w);
        }

        // splitting by .
        Pattern p = Pattern.compile("\\."); // or [.]
        String[] web = p.split("www.valdal14.com");
        for (String w: web) {
            System.out.println(w);
        }

        // Using the String method split
        String s = "Ciao, come stai? io bene, e tu?";
        String[] splitted = s.split("[,]");
        for (String w: splitted) {
            System.out.println(w);
        }
    }
}
