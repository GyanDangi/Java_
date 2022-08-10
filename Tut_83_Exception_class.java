package com.company;

import java.util.Scanner;

class MyException extends Exception{
    public String toString(){
        return  "I am toString.";
    }
    public String getMessage(){
        return " I am getMessage";
    }
}class AgeException extends Exception{
    public String toString(){
        return  "Age cannot be greater than 125.";
    }
    public String getMessage(){
        return " Please enter the correct value of age.";
    }
}
public class Tut_83_Exception_class {
    public static void main(String[] args) {
int a;
int age;
        Scanner sc= new Scanner(System.in);
        System.out.println(" How much year old you are??");
        age= sc.nextInt();
        if (age>125){
            try {
                throw new AgeException();
            }
            catch (Exception e){
                System.out.println(e.toString());
                System.out.println(e.getMessage());
            }
            System.out.println(" Finished.");
        }
        else {
            System.out.println(" You entered correct age.");
        }
        /*
        System.out.println(" Write the value of a");
        a= sc.nextInt();
        if (a<9){
            try {
//                throw new MyException();
//                throw new AgeException();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println("Finished");
            }
            System.out.println("Yes Finished..");
        }

         */
    }
}
