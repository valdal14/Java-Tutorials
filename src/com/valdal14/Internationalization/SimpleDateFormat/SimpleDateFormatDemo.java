package com.valdal14.Internationalization.SimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
        String date = sdf.format(new Date());
        System.out.println(date); // 11/6/2022

        // Convert a String representation of Data into a java.util.Date
        // 1 - Let's start creating a String date
        String strDate = "10-12-2022";
        // 2- Convert into java.util.Date
        SimpleDateFormat sdfOne = new SimpleDateFormat("dd-M-yyyy");
        Date parsedDate = sdfOne.parse(strDate);
        System.out.println(parsedDate); // Sat Dec 10 00:00:00 CET 2022

        // Let's format the time as well
        SimpleDateFormat sdfWithTime = new SimpleDateFormat("dd/MM/yy hh:mm:ss");
        String newStringDateWithTime = sdfWithTime.format(new Date());
        System.out.println(newStringDateWithTime);

        // Let's convert it back to a java.util.Date
        String strDateWithTime = "12/06/22 12:01:22";
        SimpleDateFormat sdfTwo = new SimpleDateFormat("dd/MM/yy hh:mm:ss");
        Date newParsedDateWithTime = sdfTwo.parse(strDateWithTime);
        System.out.println(newParsedDateWithTime); // Sun Jun 12 00:01:22 CEST 2022
    }
}
