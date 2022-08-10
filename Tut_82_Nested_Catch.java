package com.company;

import java.util.Scanner;

public class Tut_82_Nested_Catch {
    public static void main(String[] args) {
        int []marks=new int[4];
        marks[0]=14;
        marks[1]=32;
        marks[2]=42;
        marks[3]=98;
        Scanner sc = new Scanner(System.in);
        boolean flag= true;
        while (flag) {
            System.out.println("Enter the value of the index");
            int ind= sc.nextInt();
            try {
                System.out.println("Welcome to this video.. ..");
                try {
                    System.out.println(marks[ind]);
                    flag= false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Sorry the index does not exist");
                    System.out.println("Exception in level 2");
                }
            } catch (Exception e) {
                System.out.println(" Exception in level 1");
            }
        }
        System.out.println("Thanks for using this program..");
    }
}
