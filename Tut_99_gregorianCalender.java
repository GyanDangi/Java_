package com.company;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Tut_99_gregorianCalender {
    public static void main(String[] args) {

        Calendar c=Calendar.getInstance();
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
        GregorianCalendar cal=new GregorianCalendar();
        System.out.println(cal.isLeapYear(2020));
        System.out.println(cal.isLeapYear(2022));
        System.out.println(cal.isLeapYear(2018));
        System.out.println(cal.isLeapYear(2019));
    }
}
