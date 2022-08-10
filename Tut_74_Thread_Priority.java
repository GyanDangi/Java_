package com.company;
  class myThread4 extends Thread {
      public myThread4(String name) {
          super(name);
      }

      public void run() {
          System.out.println(" My name is " +this.getName());
//          while (true) {
//              System.out.println(" My name is " +this.getName());
//          }
      }
  }

      public class Tut_74_Thread_Priority {
          public static void main(String[] args) {
         myThread4  t1=new myThread4("Om (Important)");
         myThread4  t2=new myThread4("Prakash");
         myThread4  t3=new myThread4("Ram");
         myThread4  t4=new myThread4("Krishna");
         myThread4  t5=new myThread4("Narayan");
//         t1.setPriority(Thread.MAX_PRIORITY);
//         t2.setPriority(Thread.MIN_PRIORITY);
//         t3.setPriority(Thread.MIN_PRIORITY);
//         t4.setPriority(Thread.MIN_PRIORITY);
//         t5.setPriority(Thread.MIN_PRIORITY);
              System.out.println(" We can see that after every execution the priority of the name is changing. ");
              // When we set the priority using setPriority() method the priority object will printed more.
         t1.start();
         t2.start();
         t3.start();
         t4.start();
         t5.start();
          }
      }

