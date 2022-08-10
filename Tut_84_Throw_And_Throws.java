package com.company;
class NegativeRadiusException extends Exception{
    public String toString(){
        return  "I am toString.";
    }
    public String getMessage(){
        return " I am getMessage";
    }
}
public class Tut_84_Throw_And_Throws {
public  static  double area(int r) throws NegativeRadiusException{
    if (r<0){
        throw new NegativeRadiusException();
    }
    double result= Math.PI*r*r;
    return result;
}
    public static int divide(int a, int b) throws ArithmeticException {
        int result = a / b;               // Using throw keyword we declare Arithmetic Exception.
        return result;
    }
    public static void main(String[] args) {
           try {
//               int c= divide(6,0);
               double ar= area(9);
               System.out.println(ar);
//               System.out.println(c);
           }
           catch (Exception e){
               System.out.println("Exception.");
           }
    }

}
