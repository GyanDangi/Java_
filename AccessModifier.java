package com.company;
class C1{
    public int x=4;
    protected int y=45;
    int z=89;
    private int a=78;
    public void meth1(){  // Class ke ander hum sare modifier ko use kr saskte hai.
        System.out.println("The value of x is:"+x);
        System.out.println("The value of y is: "+y);
        System.out.println("The value of z is: "+z);
        System.out.println("The value of a is:"+a);
    }
}
class Tut_66_AccessModifier {
    public static void main(String[] args) {
  C1 c=new C1();
//  c.meth1();
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
//        System.out.println(c.a);  //Package ke ander hum private modifier ko direct access nahi kr sakte hai.

    }
}
