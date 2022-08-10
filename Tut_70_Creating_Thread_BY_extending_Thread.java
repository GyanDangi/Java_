package com.company;
  class MyThread1 extends Thread{
      @Override
      public void run(){
          int i=0;
          while(i<50)
          System.out.println(" I am thread1 cooking food.");
          System.out.println(" I am happy ");
          i++;
      }

  }class MyThread2 extends Thread{
      @Override
      public void run(){
          int i=0;
          while(i<50)
          System.out.println(" I am thread2 Chatting on whatsapp..");
          System.out.println(" I am Bramh");
          i++;
      }
  }
public class Tut_70_Creating_Thread_BY_extending_Thread {
    public static void main(String[] args) {
   MyThread1 t1=new MyThread1();
   MyThread2 t2=new MyThread2();
   t1.start();
   t2.start();
    }
}
