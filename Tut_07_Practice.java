package com.company;

import java.util.Scanner;

public class Tut_07_Practice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of test case: ");
        int t=sc.nextInt();
        int i=0;
        while (i<t){
            int x;
            x=sc.nextInt();
            System.out.println(100-x);
            i++;
        }
    }
}
