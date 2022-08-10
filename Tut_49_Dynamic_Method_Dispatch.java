package com.company;
class phone{
    public void showTime(){
        System.out.println("Music time ...");
    }
    public void no(){
        System.out.println("Turning on Phone......");
    }
}
class Smartphone extends phone{
    public void no(){
        System.out.println("Turning on SmartPhone.....");
    }
    public void music(){
        System.out.println("Playing music is allowed ");
    }
}
public class Tut_49_Dynamic_Method_Dispatch {
    public static void main(String[] args) {
//   phone obj=new phone();
//   obj.no();
        phone obj=new Smartphone(); //Yes it is allowed.
        //Phone  is the reference //
//        Smartphone obj2=new phone();  This is not allowed.
        obj.no();//
        obj.showTime();
       // obj.music();//This is not allowed.
    }
}
