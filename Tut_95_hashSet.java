package com.company;

import java.util.HashSet;

public class Tut_95_hashSet {
    public static void main(String[] args) {
        HashSet<Integer> myhashset=new HashSet<>(7,0.4f);
        myhashset.add(87);
        myhashset.add(47);
        myhashset.add(47);
        myhashset.add(37);
        myhashset.add(8);
        myhashset.add(834);
        System.out.println(myhashset);
    }
}
