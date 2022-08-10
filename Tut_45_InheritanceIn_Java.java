package com.company;
class Base {
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("Im in base setting x now.");
        this.x = x;
    }
}
class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        System.out.println("I am in Derived Class, Setting y now.");
        this.y = y;
    }
}

    public class Tut_45_InheritanceIn_Java {
    public static void main(String[] args) {
//  Base b=new Base();
//  b.setX(8);
        Derived b= new Derived();
        b.setY(78);
        System.out.println(b.getX());
        // Here we are calling the derived class only we are not setting the value of x
        // so, it will show the value of x is 0.
//        System.out.println(b.getY());
    }
}
