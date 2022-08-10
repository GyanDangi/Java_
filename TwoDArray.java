package com.company;
import java.util.*;
public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("rows: ");
        int rows=sc.nextInt();
        System.out.println("cols: ");
        int cols=sc.nextInt();
        int [][]matrix=new int [rows][cols];
        for(int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                    matrix[i][j]=sc.nextInt();
            }
        }
        System.out.printf("Your matrix of:%dX%d is\n",rows,cols);
        for(int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                    System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
        
    }
    
}
