package com.valdal14.Internationalization.DateFormat;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatDemo {

    public static void main(String[] args) {

        // Date instance
        Date date = new Date();
        // US
        DateFormat usDate = DateFormat.getDateInstance(0, Locale.US);
        // UK
        DateFormat ukDate = DateFormat.getDateInstance(0, Locale.UK);

        // print the date
        System.out.println(usDate.format(date));
        System.out.println(ukDate.format(date));

        // Get the time instance
        DateFormat italyTime = DateFormat.getTimeInstance(0, Locale.ITALIAN);
        System.out.println(italyTime.format(new Date()));

        // Get the DateTime instance
        DateFormat dateTime = DateFormat.getDateTimeInstance(0, 0);
        System.out.println(dateTime.format(new Date()));
    }
}
