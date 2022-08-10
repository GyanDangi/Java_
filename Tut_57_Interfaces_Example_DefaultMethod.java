package com.company;
interface Camera{
    void takeSnap();
    void RecordVideo();
    private void greet(){
        System.out.println("Good Morning..");// We cannot access this directly But access using this method in default method
    }
   default void Record4kVideo(){  // This is default method no need to implement this in class as other methods.
        greet();
       System.out.println(" Recording 4k Video...");
   }
}
interface WIfi{
    String[] getNetwork();
    void connectToNetwork(String Network);
}
class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("calling"+phoneNumber);
    }  void pickcall(){
        System.out.println("Connecting..");
    }

}
class MySmartPhone extends MyCellPhone implements WIfi,Camera{
    public void takeSnap(){
        System.out.println("Taking Snap....");
    }
   public void RecordVideo(){
        System.out.println("recording Video..");
    }
//   public void Record4kVideo(){
//        System.out.println(" Recording 4k Video with a snapshot...");
//    }
    public String[] getNetwork(){
        System.out.println("Getting List of Networks..");
        String[] networkList={"Gyan","Bhushan"};
        return networkList;
    }
    public void connectToNetwork(String Network){
        System.out.println("Connecting to "+Network);
    };
}
public class Tut_57_Interfaces_Example_DefaultMethod {
    public static void main(String[] args) {
    MySmartPhone ms=new MySmartPhone();
    ms.Record4kVideo();
    String[] ar=ms.getNetwork();
        for ( String item:ar) {
            System.out.println(item);
        }

//ms.greet();//Throws an error because private.
    }
}
