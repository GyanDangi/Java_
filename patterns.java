package com.company; 
import java.util.Scanner;

public class patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * Patten-01
         * * * *
         * * * *
         * * * *
         */
        // int n=sc.nextInt();
        // int m=sc.nextInt();
        // for(int i=1; i<=n; i++){
        // for (int j=1; j<=m; j++){
        // System.out.print(" x "+ " ");
        // }
        // System.out.println();
        // }

        /*
         * Patten-02
         * * * * *
         *       *
         *       *
         * * * * *
         */
        // int n=5; // We can take user input also.
        // int m=5;
        // for( int i=1; i<=n; i++ ){
        // for (int j=1; j<=m; j++){
        // if (i==1 ||j==1||i==n ||j==m) {
        // System.out.print(" x ");
        // }
        // else{
        // System.out.print(" ");
        // }

        // }
        // System.out.println();
        // }
        /*
         * patter-03
         *
         * *
         * * *
         * * * *
         */
        // int n=sc.nextInt();
        // for(int i=1; i<=n; i++){
        // for (int j=1; j<=i; j++){
        // System.out.print(" * ");
        // }
        // System.out.println();
        // }

        /*
         * patter-04
         * * * *
         * * *
         * *
         * 
         */
        // int n=sc.nextInt();
        // for(int i=n; i>=1; i--){
        // for (int j=1; j<=i; j++){
        // System.out.print(" * ");
        // }
        // System.out.println();
        // }

        /*
         * Pattern-05
              * 
            * *
          * * *
        * * * *
         * 
         */
        int n=4;
        for(int i=1; i<=n; i++){
        for(int j=1; j<=n-i; j++){
        System.out.print(" "+" "); //Keep as same don't change.
        }
        for(int j=1; j<=i; j++){
        System.out.print("*"+" ");//don't change the space as written.
        }

        System.out.println();
        }

        /*
         * Pattern-06
         * 1
         * 1 2
         * 1 2 3
         * 1 2 3 4
         * 1 2 3 4 5
         * 1 2 3 4 5 6
         * 
         */

        // System.out.println("enter number pattern print:");
        // int m=sc.nextInt();
        // for(int i=1; i<=m; i++){
        // for(int j=1; j<=i; j++){
        // System.out.print(j +" "); //Keep as same don't change.
        // }
        // System.out.println();
        // }

        /*
         * Pattern-07
         * 1 2 3 4 5 6
         * 1 2 3 4 5
         * 1 2 3 4
         * 1 2 3
         * 1 2
         * 1
         */

        // System.out.println("enter number pattern print:");
        // int n=sc.nextInt();
        // for(int i=1; i<=n; i++){
        // for(int j=1; j<=n-i+1; j++){
        // System.out.print(j +" "); //Keep as same don't change.
        // }
        // System.out.println();
        // }

        /*
         * Pattern-08
         * 1
         * 1 2
         * 1 2 3
         * 1 2 3 4
         * 1 2 3 4 5
         * 1 2 3 4
         * 1 2 3
         * 1 2
         * 1
         */

        // System.out.println("enter number pattern print:");
        // int n=sc.nextInt();
        // for(int i=1; i<=n; i++){
        // for(int j=1; j<=i; j++){
        // System.out.print(j +" "); //Keep as same don't change.
        // }
        // System.out.println();
        // }
        // for(int i=1; i<=n; i++){
        // for(int j=1; j<=n-i; j++){
        // System.out.print(j +" "); //Keep as same don't change.
        // }
        // System.out.println();
        // }

        // int n=5;
        // for(int i=1; i<=n; i++){
        //     if(i==1){
        //         for(int j=1; j<=n; j++){
        //             System.out.print(" "+"x"+" "+" ");
                    
                    
        //         }
        //         System.out.println();
        //     }
        //     else if(i==2){
        //         //This For Space:
        //         for(int j=1; j<=2; j++){
        //             System.out.print("  ");
        //         }
        //         for(int j=2; j<=n-3; j++){
        //             System.out.print(" A "+"  B "+"  C ");
        //         }
        //         System.out.println();
        //     }  
        //     else if(i==3){
        //         // For space:
        //         for(int j=1; j<=3; j++){
        //             System.out.print("  "+" ");
        //         }
        //         for(int j=2; j<=n-3; j++){
        //             System.out.print("x");
        //         }
        //         System.out.println();
                
        //     }
        //     else if(i==4){
        //         // For Space
        //         for(int j=1; j<=4; j++){
        //             System.out.print("  ");
        //         }
        //         for(int j=2; j<=n-3; j++){
        //             System.out.print("10");
        //         }
        //         System.out.println();
                
        //     }
            
        // }
        
        // for(int i=n-2; i>=1; i--){
        //     // This is for space
        //     for(int j=2; j<=i; j++){
        //         System.out.print("  "+"  ");
               
        //     }
        //     for(int j=1;j<=n-2*i+2; j++){
        //         System.out.print(j*10 + "  ");
        //     }
        //     System.out.println();
           
        // }
        
    }
    






    
}
