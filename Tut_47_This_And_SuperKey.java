package com.company;

import javax.management.remote.SubjectDelegationPermission;

class Ekclass{
    int x;

    public int getX() {
        return x;
    }


    Ekclass(int x){
  this.x =x;// This will show the parameter that we have entered.
//  x =x;  // this will show the 0 value only.
//        "This" is a reference to refer any value.
    }
    public  int returnOne(){
        return 1;
    }
}
class DoClass extends Ekclass{
    DoClass(int c){
        super(c);
        System.out.println("I am constructor");
    }


}
public class Tut_47_This_And_SuperKey {
    public static void main(String[] args) {
  Ekclass Ek=new Ekclass(9);
  DoClass d= new DoClass(91);
//        System.out.println(Ek.getX());
    }
}
