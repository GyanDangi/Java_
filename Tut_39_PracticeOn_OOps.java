package com.company;
class Employee{
    int salary;
    String Name;

    public int getSalary(){
        return  salary;
    }

    public String getName() {
        return Name;
    }

    public void setName(String n){
            Name=n;
    }
}
class Cellphone{
    public void Ring(){
        System.out.println("Ringing...");
    }
    public void Vibrate(){
        System.out.println("Vibrating...");
    }
}
class Square{
    int side;
    public int area(){
        return side*side;
    } public int perimeter(){
        return 4*side;
    }
}
class Rectangle1{
    int length;
    int breadth;
    public int area(){
        System.out.println("The area of rectangle is");
        return length*breadth;
    }public int perimeter(){
        System.out.println("The perimeter of rectangle is");
        return 2*length + 2*breadth;
    }
}
public class Tut_39_PracticeOn_OOps {
    //problem1
    public static void main(String[] args) {
       /* Employee Gyan= new Employee();
        Gyan.setName("GyanPrakash");
        Gyan.salary=233;
        System.out.println(Gyan.getSalary());
        System.out.println(Gyan.getName());
        //problem2
        Cellphone realme= new Cellphone();
        realme.Ring();
        realme.Vibrate();

        //problem 3
        Square sq=new Square();
        sq.side=5;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
        */
        Rectangle1 rect=new Rectangle1();
        rect.length=3;
        rect.breadth=4;
        System.out.println(rect.area());
        System.out.println(rect.perimeter());
    }
}
