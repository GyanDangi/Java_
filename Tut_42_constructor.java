package com.company;
class MymainEmployee{
   private int Id;
   private int salary;
   private String Name;
   //Default Constructor
//   public MymainEmployee(){
//       Id=45;
//       Name="Your-Name-Is-Here";
//   }
    // Constructor are non-returnable.
   //Parameterized Constructor : It will take parameter.
   public MymainEmployee(String Myname){
       Id=45;
       Name="Myname";
   }  public MymainEmployee(int   MySalary){
       salary= MySalary;
   }
   public void SetName(String name){
       Name= name;
   }
   public void SetId(int i){
       Id= i;
   }
   public String GetName(){
       return Name;
   }
   public int GetSalary(){
       return salary;
   }
   public int GetId(){
       return Id;
   }

}
public class Tut_42_constructor {
    public static void main(String[] args) {
   MymainEmployee Gyan= new MymainEmployee("GyanDangi");
   MymainEmployee harry= new MymainEmployee(100000);
//   Gyan.SetName("GyanPrakashDangi");
        System.out.println(Gyan.GetName());
        System.out.println(Gyan.GetId());
        System.out.println(harry.GetSalary());
    }
}
