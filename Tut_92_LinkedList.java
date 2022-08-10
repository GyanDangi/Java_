package com.company;

import java.util.LinkedList;

public class Tut_92_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l1= new LinkedList<>();
        LinkedList<Integer> l2= new LinkedList<>();
//        LinkedList<Integer> l3= new LinkedList<>(87); Capacity can't be set in the linkedList.
        l1.add(12);
        l1.add(32);
        l1.add(23);
        l1.add(45);
        l1.add(90);
        l2.add(834);
        l2.add(834);
        l2.add(856);
        l1.addAll(l2);
        l1.addFirst(1);//  this method only present in linkedList
        l1.addLast(2);// this method only present in linkedList
        System.out.println(l1.toArray());
        for (int i=0; i<l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(" ");
        }
    }
}
