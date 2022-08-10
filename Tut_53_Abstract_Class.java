package com.company;
 abstract class Parent{
    public Parent(){
        System.out.println("I am the Parent ");
    }
    public void Hello(){
        System.out.println("Hello");
    }
    abstract public void greet();// This is abstract method that why we have to make overall class to be abstract.
//    If We make an abstract class them we have to implement the abstract method as well, that is necessary.
 }
class child extends Parent{
     public void greet(){
         System.out.println("Good Morning.");// this class is not declare as abstract so need to
         //  implement the method greet.
     }
}
abstract class child1 extends Parent{
     public void Th(){
         System.out.println("Good Morning.");   // In child1 class we not implement the method greet
         // still it is not showing error because we have to declare child1 as a abstract class.
     }
}
public class Tut_53_Abstract_Class {
    public static void main(String[] args) {
//  Parent p= new Parent() ; // We need to implement it first
  Parent p= new Parent()
  {   // Implementation of abstract class is required.
      @Override
      public void greet() {
          System.out.println("Hey buddy how are you.");
      }
  };
  p.greet();

        child c=new child();
        c.greet();
//        child1 cd=new child1() ; //error because abstract class.
        }


}
