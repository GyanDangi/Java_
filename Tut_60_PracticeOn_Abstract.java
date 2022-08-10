package com.company;
// Question 1: Create an abstract class Pen with method write(), and refill().
// Question 2: use the pen class to create a concrete class FountainPen with additional method ChangeNib();
// Question 3: Create a class monkey with jump() and bite() methods.
//  Create a class Human which inherits the Monkey class & implements the BasicsAnimal interface with
// eat() and sleep().
  abstract  class pen{
      abstract void write();
      abstract void refill();
  }
  class FountainPen extends pen{  // FountainPen Class is the concrete class.
      public void write(){
          System.out.println("Writing With Pen.");
      }
      public void refill(){
          System.out.println("Refilling The Pen");
      }
      public void ChangeNib(){  // This is additional method that we have added.
          System.out.println("Changing the Nib Of the pen.");
      }
  }
  class Monkey{
      public void jump(){
          System.out.println("Jumping from the tree.");
      }
      public void bite(){
          System.out.println(" Bite");
      }
  }
  interface BasicAnimal{
      void eat();
      void  sleep();
  }
  class Human extends Monkey implements BasicAnimal{
      void speak(){
          System.out.println("Hello sir, How the day..");
      }

      @Override
      public void sleep() {
          System.out.println("The person you want to contact is in sleeping mode..");
      }

      @Override
      public void eat() {
          System.out.println(" Eating food so don't disturb");
      }
  }
public class Tut_60_PracticeOn_Abstract {
    public static void main(String[] args) {
//        Problem1
//     FountainPen pen2=new FountainPen();
//     pen2.ChangeNib();
//     pen2.refill();
//     pen2.write();
        // Problem 2:
        Human Gyan=new Human();
        Gyan.eat();
        Gyan.bite();// Inheriting the methods of Monkey class.
        Gyan.jump();// Inheriting the methods of Monkey class.

//        Problem 3
        Monkey monk=new Human();
//        monk.sleep();  only monkey methods can be implemented.
        BasicAnimal prakash=new Human();
//        prakash.speak();
        prakash.eat();

    }
}
