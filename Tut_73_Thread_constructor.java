package com.company;
   class Mythread3 extends Thread{
       public Mythread3(String name){
           super(name);
       }
       public void run(){
           System.out.println(" I am thread constructor..");
       }
   }
public class Tut_73_Thread_constructor {
    public static void main(String[] args) {
     Mythread3 t1=new Mythread3("Gyan");
     Mythread3 t2=new Mythread3("Prakash");
     t1.start();
        System.out.println("the id of the thread1 is:"+ t1.getId());
        System.out.println("the id of the thread2 is:"+ t2.getId());
        System.out.println("the name of the thread1 is:"+ t1.getName());
        System.out.println("the name of the thread2 is:"+ t2.getName());
        System.out.println("the Priority of the thread2 is:"+ t2.getPriority());
        System.out.println("the ClassLoader of the thread2 is:"+ t2.getContextClassLoader());
        System.out.println("the State of the thread2 is:"+ t2.getState());
// getName(), getId() etc. this all  the methods of the thread.
    }
}
