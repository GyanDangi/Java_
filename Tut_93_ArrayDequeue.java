package com.company;

import java.util.ArrayDeque;

public class Tut_93_ArrayDequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1= new ArrayDeque<>();
        ad1.add(98);
        ad1.add(938);
        ad1.add(123);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
    }
}
