package com.company;
class  Circle{
    public int radius;
     Circle(){
         System.out.println("I am a default constructor of Circle.");
     }
    Circle(int r){
        System.out.println("I am a parameterized  constructor of circle.");
        this.radius=r;
    }
    public double area(){
        System.out.println("The area of the circle.");
        return Math.PI*radius*radius;
    }
}
class Cylinder3 extends Circle{
    public int height;

    Cylinder3(int r, int h) {
        super(r);
        System.out.println("I am a parameterized  constructor of Cylinder.");

    }
    public double volume(){
        System.out.println("The volume of the cylinder is:");
        return Math.PI*radius*radius*height;
    }
}
public class TUt_51_Practice_On_Inheritance {
    public static void main(String[] args) {
//Circle c=new Circle(3);
//        System.out.println(c.area());
Cylinder3 cyl=new Cylinder3(2,3);
        System.out.println(cyl.volume());
    }
}
