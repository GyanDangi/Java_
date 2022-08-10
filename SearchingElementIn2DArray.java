
package com.company; 
import java.util.*;


public class SearchingElementIn2DArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows:");
        int rows=sc.nextInt();
        System.out.println("Enter cols:");
        int cols=sc.nextInt();
        int matrix[][]=new int[rows][cols];
        for(int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        // number we want to search.
        System.out.println("Enter the number to search in matrix:");
        int x=sc.nextInt();
        for(int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                if(matrix[i][j]==x){
                    System.out.printf("%d is found at(%d, %d)", x,i, j);
                }   
            }  
        }
    }
}
