package com.valdal14.Java12Features.NumberFormat;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo {

    public static void main(String[] args) {

        NumberFormat format = NumberFormat.getCompactNumberInstance();
        System.out.println(format.format(1000));

        format = NumberFormat.getCompactNumberInstance(Locale.ITALIAN, NumberFormat.Style.SHORT);
        System.out.println(format.format(100));
        System.out.println(format.format(1000000));
    }
}
