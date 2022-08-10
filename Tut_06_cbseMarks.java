package com.company;

import java.util.Scanner;

public class Tut_06_cbseMarks {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the marks of maths.");
        float maths=sc.nextInt();
        System.out.println("Enter the marks of physics.");
        float physics=sc.nextInt();
        System.out.println("Enter the marks of chemistry.");
        float chemistry=sc.nextInt();
        System.out.println("Enter the marks of english.");
        float english=sc.nextInt();
        System.out.println("Enter the marks of hindi.");
        float hindi=sc.nextInt();
        float total=maths+english+hindi+physics+chemistry;
        System.out.println("The total marks is: "+total);
        double div=total/500;
        double percentage=div*100;
        System.out.println("The percentage is:"+percentage);

    }
}
