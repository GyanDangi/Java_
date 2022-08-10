package com.company;
class MyThreadRunnable1 implements Runnable{
    public void run() {
        int i = 0;
        while (i < 100) // meanwhile , this condition is always  true.
             {
            System.out.println(" I am Thread1 shooting with bullet1");
            i++;
        }
    }
}class MyThreadRunnable2 implements Runnable{
    public void run() {
        int i = 0;
        while (i<100)//  meanwhile, this condition is always true
        {
            System.out.println(" I am Thread1 shooting with bullet2");
            i++;
        }
    }
}
public class Tut_71_Thread_using_Runnable_interface {
    public static void main(String[] args) {
     MyThreadRunnable1 bullet1=new MyThreadRunnable1();
     Thread gun1= new Thread(bullet1);  // Ye hame dena padega. this is required part
     MyThreadRunnable2 bullet2=new MyThreadRunnable2();
     Thread gun2= new Thread(bullet2);// Ye bhi hame dena padega. this is also a required part
        gun1.start();
        gun2.start();
    }
}
