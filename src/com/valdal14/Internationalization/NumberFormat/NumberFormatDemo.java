package com.valdal14.Internationalization.NumberFormat;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo {

    public static void main(String[] args) {

        Double d = 2314124.324243;
        // Instance method creates the NumberFormat
        NumberFormat nf = NumberFormat.getInstance();
        // How will the Double d displayed in Italy
        System.out.println(nf.format(d)); // 2,314,124.324 becuase the dafault Locale is still use
        // Let's change the locale to Italy
        Locale.setDefault(Locale.ITALY);
        Locale italy = Locale.getDefault();
        System.out.println(nf.format(d));
        // We can also pass a locale directly when we create a new NumberFormat instance
        NumberFormat france = NumberFormat.getInstance(Locale.FRANCE);
        System.out.println(france.format(d));

        // Dealing with Decimals and Integer part
        nf.setMinimumFractionDigits(1);
        nf.setMinimumFractionDigits(2);

        nf.setMinimumIntegerDigits(7);
        nf.setMaximumIntegerDigits(10);
        System.out.println(nf.format(d));
    }
}
