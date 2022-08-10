package com.company;
import java.util.*;

public class Tut_91_ArrayList {
    public static void main(String[] args) {
ArrayList<Integer> l1= new ArrayList<>();
ArrayList<Integer> l2= new ArrayList<>(5);// we set the capacity also..
/// ArrayList is modifed array. // THis is the syntax of generic
        l1.iterator();
       l2.add(123);
       l2.add(165);
       l2.add(143);
       l2.add(134);
        l1.add(8);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(9);
        l1.add(6);
        l1.add(0,87);
        l1.listIterator(0);
//        l2.remove(2);
        System.out.println(l1.isEmpty()); // this is weather the elements are present in the array or not.
//        l1.addAll(l2);// Add all the elements of the array2 at last
        l1.addAll(0,l2); // This will add all the elements at the first.
//        l1.clear();  this will clear all the elements presents in the array.
        System.out.println(l1.contains(123));
        System.out.println(l1.indexOf(87));
        for (int i=0; i<l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(",");
        }


    }
}
