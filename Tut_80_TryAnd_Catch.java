package com.company;

public class Tut_80_TryAnd_Catch {
    public static void main(String[] args) {
        int a=4000;
        int b=0;
        // Without try
//        int c=a/b;
        // With try:
        try {
            int c=a/b;
            System.out.println("The result is "+c);
        }
        catch (Exception e){
            System.out.println(" We failed to divide . Reason:");
            System.out.println(e);
        }
        System.out.println(" Ending the program.");
    }
}
