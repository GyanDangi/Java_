package com.company;
    interface Bicycle{
        int a=45;
        void applybrake(int decrement);
        void speedup(int increment);
    }
    interface HornBicycle{
        void BlowHorn();
        void BlowHorn1();// We have to define this method in the class
    }                   // If not define this method in class then error will ocured.
    class AvonCycle implements Bicycle, HornBicycle{
        void BlowHorn2(){
            System.out.println("Pee Pee Pee Poo");
        }
        public void applybrake(int decrement){
            System.out.println("Applying Brakes.");
        };
        public void speedup(int increment){
            System.out.println("Applying SpeedUP.");
        };
        public void BlowHorn(){
            System.out.println(" Ek din Aisa ayenga.....Pii Pii Pii Pii");
        };
       public void BlowHorn1(){
            System.out.println(" Ye Bhi bit Jayenga.......Po  Po  Po  Po");
        };
    }
public class Tut_55_Interface {
    public static void main(String[] args) {
AvonCycle Cycle=new AvonCycle();
Cycle.applybrake(9);
//        System.out.println(Cycle.a);
        // We can create properties in interfaces.
        // We cannot modify the properties in interface as they are final.
//        Cycle.a=565;  This will throw error.
        Cycle.BlowHorn();
        Cycle.BlowHorn1();
        Cycle.BlowHorn2();
    }
}
