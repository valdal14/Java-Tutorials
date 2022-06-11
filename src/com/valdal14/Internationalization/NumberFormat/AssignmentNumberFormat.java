package com.valdal14.Internationalization.NumberFormat;

import java.text.NumberFormat;
import java.util.Locale;

public class AssignmentNumberFormat {

    public static void main(String[] args) {

        Long l = 9223372036854775807L;

        // US
        NumberFormat nf = NumberFormat.getNumberInstance();
        System.out.println(nf.format(l));
        // switch to UK
        Locale.setDefault(Locale.UK);
        System.out.println(Locale.getDefault());
        System.out.println(nf.format(l));
    }
}
