package com.company;
class Employee1{
    int id;
    int salary;
    String Name;
    public void PrintDetails(){ //Method or verbs
        System.out.println("My id is "+id);
        System.out.println("My Name is "+Name);
    }
    public int getSalary(){  // method second.
        return salary;
    }
}
public class Tut_38_CustomClass {
    public static void main(String[] args) {
        System.out.println("This is our Coustom Class");
        Employee1 Gyan=new Employee1();//Instantiating A new Employee object
        Employee1 john= new Employee1();
        //Setting Attributes.
        john.id=82;
        john.Name="JohnBhaiya";
        john.salary=12000;
        Gyan.id=06;
        Gyan.Name="GyanDangi";
        Gyan.salary=15000;
        //Printing the attributes.
        Gyan.PrintDetails();
        john.PrintDetails();
        int salary= Gyan.getSalary();
        System.out.println(salary);
        // System.out.println(Gyan.id);
        // System.out.println(Gyan.Name);
    }
}
