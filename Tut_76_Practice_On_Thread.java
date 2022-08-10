package com.company;
class PracticeThread extends Thread{
public void run(){
//    while (true){
        /*try {
            Thread.sleep(200); // This method is used to stop the given condition for some second.
        }
        catch (Exception e){
            System.out.println(e);
        }*/
        System.out.println(" Hello Good Morning");
//    }
}
}
class PracticeThread1 extends Thread{
public void run(){
//    while (true){
    /*    try {
Thread.sleep(200);
        }
        catch (Exception e){
            System.out.println(e);
        }*/
        System.out.println(" Hello..!! Welcome..");
//    }
}
}
public class Tut_76_Practice_On_Thread {
    public static void main(String[] args) {
        // Problem 01

PracticeThread t1=new PracticeThread();
PracticeThread1 t2=new PracticeThread1();
t1.setPriority(8);
t2.setPriority(9);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t2.getState());// This will show new .
t1.start();
        t2.start();
        System.out.println(t2.getState());  // This will show Runnable.
        System.out.println(Thread.currentThread().getState());


    }
}
