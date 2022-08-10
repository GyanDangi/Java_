package com.company;
class myThread5 extends Thread {
    public void run() {
//        int i=0;
//          while (i<50) {
//              System.out.println(" Hello I am thread 1 of this class.");
//          }
        for (int i=0; i<50; i++){
        System.out.println(" Hello I am thread 1 of this class.");
    }}
}
class myThread6 extends Thread {
    public void run() {
//          while (true) {
//              System.out.println(" Hello I am thread 2 of this class.");
//          }
//        System.out.println(" Hello I am thread 2 of this class.");
        for (int i=0; i<50; i++){
            System.out.println(" Hello I am thread 2 of this class.");
        }
    }
    }

public class Tut_75_Thread_method {
    public static void main(String[] args) {
     myThread5 t1= new myThread5();
     myThread6 t2= new myThread6();
     t1.start();
     try {
         t1.join();
     }
     catch (Exception e){
         System.out.println(e);
     }
     t2.start();
    }
}
