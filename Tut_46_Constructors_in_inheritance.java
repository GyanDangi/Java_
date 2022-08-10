
package com.company;
class Base1{
    Base1(){
        System.out.println("I am constructor");
    }
    Base1(int x){
        System.out.println("I am a overloaded Constructor with value of x as: "+x);
    }


}
class Derived1 extends Base1{

Derived1(){
    System.out.println("I am a Derived Constructor");
}
Derived1(int x,int y){
    super(x);
    System.out.println("I am a overloaded Constructor of derived class with value of y as: "+y);
}

}
class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("I am a child of derived constructor.");
    }  ChildOfDerived(int x, int y,int z){
        super(x, y);
        System.out.println("I am a overloaded Constructor of Child Derived Class with value of z as: "+z);
    }
}
public class Tut_46_Constructors_in_inheritance {
    public static void main(String[] args) {
//    Base1 b= new Base1();
//Derived1 d= new Derived1();
//Derived1 d= new Derived1(14,9);
//ChildOfDerived cd=new ChildOfDerived();
ChildOfDerived cd=new ChildOfDerived(12,42,4);
    }
}
