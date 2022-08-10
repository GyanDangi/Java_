package com.company;

import java.util.Calendar;

public class Tut_98_CalenderClass {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        System.out.println("The name of the calender "+c.getCalendarType());
//        System.out.println(c.getTimeZone());
        System.out.println(c.getTimeZone().getID());
        System.out.println(c.getTime());
    }
}
