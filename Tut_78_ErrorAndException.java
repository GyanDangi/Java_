package com.company;

import java.util.Scanner;

public class Tut_78_ErrorAndException {
    public static void main(String[] args) {
//        SYNTAX ERROR  DEMO
//        int a=7  semicolon is not written
//        b=87; b is not declared

//        Logical Error DEMO
        // print tha all the prime number between 1 to 10.
        System.out.println(2);
        for (int i=1; i<5; i++){
            System.out.println(2*i+1);
        }

//        Runtime Error
        int k;
        Scanner sc=new Scanner(System.in);
        System.out.println(" write the number ");
        k= sc.nextInt();
        System.out.print("Integer part of 1000 divided by k is:"+1000/k);
    }
}
