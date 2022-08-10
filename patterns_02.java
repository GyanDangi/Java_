package com.company; 
import java.util.*;
import java.util.regex.Pattern;
public class patterns_02 {
    public static void main(String[] args) {
        Scanner sc= new Scanner( System.in);
        System.out.print("Enter the row size:");
    //    Pattern-01
        // Butterfly Pattern.
        /*
            x             x 
            x x         x x
            x x x     x x x
            x x x x x x x x
            x x x x x x x x
            x x x     x x x
            x x         x x
            x             x
         */
        // Upper half:
        // int n=sc.nextInt();
        // for(int i=1; i<=n; i++){
            
        //     // Left Side Star.
        //     for(int j=1; j<=i; j++){
        //         System.out.print("x"+" ");
        //     }
        // //    Spaces
        //     int spaces=2*(n-i);
        //     for(int j=1; j<=spaces; j++){
        //         System.out.print(" "+" ");
        //     }
        //     // Right Side stars.
        //     for (int j=1; j<=i; j++){
        //         System.out.print("x"+" ");
        //     }
        //     System.out.println();
        // }

        // // Lower half :
        // // We here just reverted the value of the i.
        // for(int i=n; i>=1; i--){
            
        //     // Left Side Star.
        //     for(int j=1; j<=i; j++){
        //         System.out.print("x"+" ");
        //     }
        // //    Spaces
        //     int spaces=2*(n-i);
        //     for(int j=1; j<=spaces; j++){
        //         System.out.print(" "+" ");
        //     }
        //     // Right Side stars.
        //     for (int j=1; j<=i; j++){
        //         System.out.print("x"+" ");
        //     }
        //     System.out.println();
        // }

        //    Pattern-02
        //  Solid Rhombus.
        /*
                 x x x x x 
              x x x x x
            x x x x x
          x x x x x
        x x x x x
         */
        // int n=sc.nextInt();
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<n-i+1; j++){
        //         System.out.print(" "+" ");
        //     }
        //     for(int j=1; j<=n; j++){
        //         System.out.print("x"+" ");
        //     }
        //     System.out.println();
        // }
        
        //    Pattern-03
        /*    
          1
          2 3
          4 5 6
          7 8 9 10
          11 12 13 14 15
          16 17 18 19 20 21
         */


        // int n= sc.nextInt();
        // int number=1;
        // for(int i=0; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(number+" ");
        //         number++;
        //     }
        //     System.out.println();
        // }

        //    Pattern-04
            /*
                 
                 1
                2 2
               3 3 3
              4 4 4 4
             5 5 5 5 5
            6 6 6 6 6 6
             */
        // int n= sc.nextInt();
        // // int number=1;
        // for(int i=0; i<=n; i++){
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
                
        //     }
        //     for(int j=1; j<=i; j++){
        //         System.out.print(i+" ");
                
        //     }
        //     System.out.println();
        // }

        //  Pattern-05
        //  Odd palindrome.
        /*
             1
            121
           12321
          1234321
         123454321
        12345654321
         */

            // int n=sc.nextInt();
            // for(int i=1; i<=n; i++){
            //     for(int j=1; j<=n-i; j++){
            //         System.out.print(" ");
            //     }
            //     for(int j=1; j<=i; j++){
            //         System.out.print(j);
            //     }
            //     for(int j=i-1; j>=1; j--){
            //         System.out.print(j);
            //     }
            //     System.out.println();
            // }
         

                // Pattern-06
                // Even Palindrome:
                /*
                     11
                    1221
                   123321
                  12344321
                 1234554321
                123456654321
                 */

            // int n=sc.nextInt();
            // for(int i=1; i<=n; i++){
            //     for(int j=1; j<=n-i; j++){
            //         System.out.print(" ");
            //     }
            //     for(int j=1; j<=i; j++){
            //         System.out.print(j);
            //     }
            //     for(int j=i; j>=1; j--){
            //         System.out.print(j);
            //     }
            //     System.out.println();
            // }

                // Pattern-07
                //  Diamond palindrome.
            /*
                 11
                1221
               123321
              12344321
             1234554321
            123456654321
            123456654321
             1234554321
              12344321
               123321
                1221
                 11
             */



            int n=sc.nextInt();
            for(int i=1; i<=n; i++){
                for(int j=1; j<=n-i; j++){
                    System.out.print(" ");
                }
                for(int j=1; j<=i; j++){
                    System.out.print(j);
                }
                for(int j=i; j>=1; j--){
                    System.out.print(j);
                }
                System.out.println();
            }
            for(int i=n; i>=1; i--){
                for(int j=1; j<=n-i; j++){
                    System.out.print(" ");
                }
                for(int j=1; j<=i; j++){
                    System.out.print(j);
                }
                for(int j=i; j>=1; j--){
                    System.out.print(j);
                }
                System.out.println();
            }


        

    }
}
