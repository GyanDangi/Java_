package com.company;
class MyEmployee{
    private int id;
   private String Name;

    public void setName(String name) {
        Name = name;
    }
    public String getName(){  //Getter will return the value
        return Name;
    }
    public void setId(int i){  //Setter will set the value or update the value.
        id=i;
    }
    public int getId(){
        return id;
    }//Getter will return any value
}
public class Tut_40_AccessModifier {
    public static void main(String[] args) {
       MyEmployee Gyan=new MyEmployee();
//       Gyan.id=34;
//       Gyan.Name="GyanPrakash";  This will throw error due to private modifier
        Gyan.setName("GyanPrakash");// Setter
        Gyan.setId(56);// setter
        System.out.println(Gyan.getName());// Getter
        System.out.println(Gyan.getId());  //Getter
        //WE can't use (.) operator when we use private modifier
        // we need to use getter and setter
    }
}
