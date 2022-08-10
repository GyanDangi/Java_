package com.company;

public class Tut_85_Finally {
    public static int greet() {
        try {
            int a = 5, b = 9;
            int c = a / b;
            return c;
        } catch (Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println(" Cleaning Resources.");
        }
       return -1;

    }
    public static void main(String[] args) {
      int k= greet();
        System.out.println(k);
        int a=4, b=9;
        while (true){

            try {
                System.out.println(a/b);
            }catch (Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println(" I am finally for the value of "+b);
                b--;
            }
            try {
                System.out.println(40/10);
            }
            finally {
                System.out.println(" No problem you can use finally instead of catch ");
            }
        }
    }
}
