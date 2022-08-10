package com.company;

class  Cylinder{
      private int radius;
      private int height;
      public int GetRadius(){
          return radius;
      }


      public Cylinder(int radius, int height) {
          this.radius = radius;
          this.height = height;
      }

      public int GetHeight(){
          return height;
      }
      public void setRadius(int radius){
         this. radius=radius;
      }
      public void setHeight(int height){
          this.height=height;
      }
      public double surfaceArea(){
          System.out.print("The SurfaceArea of Cylinder is: ");
          return 2*3.14*radius*height + 2*3.14*radius*radius;
      }
      public double volume(){
          System.out.print("The volume of Cylinder is: ");
          return Math.PI*radius*radius*height;
          //Math.PI= 3.14
      }
  }
class Rectangle{
    private int length;
    private int breadth;

    public Rectangle() {
        this.length = 4;
        this.breadth =5;
    }
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }


}
public class Tut_44_PracticeOnAccess_Modifier {
    public static void main(String[] args) {
   Cylinder myCylinder= new Cylinder(12,10);
 /*   //Problem 01
        // Problem 02

      myCylinder.setHeight(12);
        myCylinder.setRadius(10);
        System.out.println(myCylinder.GetHeight());
        System.out.println(myCylinder.GetRadius());

*/
        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.volume());
        //Problem 03
  Rectangle r=new Rectangle();
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());
    }
}
