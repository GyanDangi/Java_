package com.company;
interface SampleInterface{
    void meth1();
    void meth2();
}
interface ChildSampleInterface extends SampleInterface{
    void meth3();
    void meth4();
}
// Interface cannot implements another interface only class can do that.
//interface ChildSampleInterface1 implements SampleInterface{
//    void meth3();
//    void meth4();

class MySampleClass implements ChildSampleInterface{
    //jab tak hum meth1 aur meth2 nahi implements krenge tab tak code run nahi honga.
    public void meth1(){
        System.out.println("I am method-1");
    } public void meth2(){
        System.out.println("I am method-2");
    } public void meth3(){
        System.out.println("I am method-3");
    }
    public void meth4(){
        System.out.println("I am method-4");
    }
}
public class Tut_58_InheritanceIn_Interface {
    public static void main(String[] args) {
    MySampleClass Sc=new MySampleClass();
    Sc.meth1();
    Sc.meth2();
    Sc.meth3();
    Sc.meth4();
    }
}
