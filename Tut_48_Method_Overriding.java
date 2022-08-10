package com.company;
class A{
    int a;
    public int Shyam(){
        return 4;
    }
    public void Method1(){
        System.out.println("I am method 1 of class A");
    }
}
class B extends A{
    public void Method2(){
        System.out.println(" I am method 2 of Class B ");
    }
    @Override
    public void Method1(){
        System.out.println("I am method 1 of class B");
    }
}

public class Tut_48_Method_Overriding {
    public static void main(String[] args) {
   A a = new A();
   a.Method1();
   B b= new B();
   b.Method1();
    }
}
