package com.company; 
import java.util.*;
public class Array{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array u want.");
        int size=sc.nextInt();
        int []array=new int [size];
        System.out.println("Enter the element of the array");
        for (int i=0; i<size; i++){
            
            array[i]=sc.nextInt();
        }
        System.out.print("the array is:");
        for (int i=0; i<size; i++){
            System.out.print(+array[i]+" ");
        }
        
    }
}