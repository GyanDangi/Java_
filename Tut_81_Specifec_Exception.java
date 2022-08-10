package com.company;

import java.util.Scanner;

public class Tut_81_Specifec_Exception {
    public static void main(String[] args) {
        int [] marks= new int[3];
        marks[0]=45;
        marks[1]=53;
        marks[2]=98;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array Index");
        int ind= sc.nextInt();

        System.out.println("Enter the number you want to divide the number with");
        int num=sc.nextInt();
        try {
            System.out.println("The value of the array index entered is:"+marks[ind]);
            System.out.println("The value of the array- value/number is:"+marks[ind]/num);

        }

        catch (ArithmeticException e){
            System.out.println("ArithmeticException occured.");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(" ArrayIndexOutOfBoundsException occured.");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Some exception will occured.");
            System.out.println(e);
        }
    }
}
