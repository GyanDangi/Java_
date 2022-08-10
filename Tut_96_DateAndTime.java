package com.company;

public class Tut_96_DateAndTime {
    public static void main(String[] args) {
        System.out.print("The millisecond passed since 1/january/1975: ");
        System.out.println(System.currentTimeMillis());
        System.out.print("The year passed since 1/january/1975:  ");
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);// for calculating the year passed
        System.out.println(System.currentTimeMillis()/1000/3600/24);// for calculating the  days
        System.out.println(System.currentTimeMillis()/1000/3600);// for calculating the  hours
        System.out.println(52*365);
    }
}
