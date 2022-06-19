package com.valdal14.Java16Features.TimeFormat;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeFormatDemo {

    public static void main(String[] args) {

        LocalTime time = LocalTime.parse("11:30:09.123456");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hma B");
        System.out.println(time.format(formatter));
    }
}
