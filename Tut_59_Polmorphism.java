package com.company;
// Polymorphism means a person can be a painter, plumber, cook , driver at a time.
interface Camera1{
    void takeSnap();
    void RecordVideo();
    private void greet(){
        System.out.println("Good Morning..");// We cannot access this directly But access using this method in default method
    }
    default void Record4kVideo(){  // This is default method no need to implement this in class as other methods.
//        greet();
        System.out.println(" Recording 4k Video...");
    }
}
interface WIfi1{
    String[] getNetwork();
    void connectToNetwork(String Network);
}
class MyCellPhone1{
    void callNumber(int phoneNumber){
        System.out.println("calling.. "+phoneNumber);
    }  void pickcall(){
        System.out.println("Connecting.. ");
    }

}
class MySmartPhone1 extends MyCellPhone1 implements WIfi1,Camera1{
    public void takeSnap(){
        System.out.println("Taking Snap....");
    }
    public void RecordVideo(){
        System.out.println("recording Video..");
    }
//       public void Record4kVideo(){   // If we uncomment this method then default method will not execute
//        System.out.println(" Recording 4k Video with a snapshot...");
//    }
    public String[] getNetwork(){
        System.out.println("Getting List of Networks..");
        String[] networkList={"Gyan","Bhushan"};
        return networkList;
    }
    public void connectToNetwork(String Network){
        System.out.println("Connecting to "+Network);
    }
//    static void method3(){
//        System.out.println("Hi how are you...");
//    }
}

public class Tut_59_Polmorphism {
    public static void main(String[] args) {
        Camera1 cam=new MySmartPhone1();// This is a smartphone for a camera only.
//        cam.getNetwork();// --> This is not allowed. Because at a time we can use it as camera only.
        cam.Record4kVideo();
        MySmartPhone1 Realme= new MySmartPhone1();// We can use all the methods.
        Realme.connectToNetwork("Ram");
        Realme.getNetwork();
        Realme.callNumber(90874322);
        Realme.pickcall();
        Realme.takeSnap();
        Realme.Record4kVideo();//Using camera also.
    }
}
