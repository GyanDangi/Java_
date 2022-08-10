package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Tut_101_DateTimeForamatter {
    public static void main(String[] args) {
        LocalDateTime dt =LocalDateTime.now();
        System.out.println(dt);
        DateTimeFormatter df= DateTimeFormatter.BASIC_ISO_DATE;
        DateTimeFormatter df1= DateTimeFormatter.ISO_LOCAL_DATE;
        DateTimeFormatter df2= DateTimeFormatter.ofPattern("yyyy/MM/dd--E H:m a");
        System.out.println(df);
//        String date= dt.format(df);
//        System.out.println(date);
        String date1= dt.format(df1);
        String date2= dt.format(df2);
        System.out.println(date1);
        System.out.println(date2);
    }
}
