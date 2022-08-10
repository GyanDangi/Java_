package com.company;
import java.util.Random;
import java.util.Scanner;

/*
   Create a class  Game which allow user to play "Guess the Number"
   game once.  Game should have following  methods:
   1. Constructor to generate the Random Number.
   2. TakeUserInput()  to take a user input of number.
   3.IsCorrectNumber() to detect whether the number entered by the user is ture
   4. Getter and Setter for No of guesses.
   5.
 */

 class GuessGame{

     public int number;
     public int noofGuesses=0;
     public int inputno;
     public int getNoofGuesses() {
         return noofGuesses;
     }

     public void setNoofGuesses(int noofGuesses) {
         this.noofGuesses = noofGuesses;
     }

      GuessGame(){
         Random rand= new Random();
         this.number=rand.nextInt(50);
     }

     void TakeuserInput(){
         System.out.println("Guess the number between 1 to 50.");
         Scanner sc=new Scanner(System.in);
         inputno=sc.nextInt();
     }
     boolean Iscorrect(){
         noofGuesses++;
//         if (noofGuesses<4){
//             System.out.println("Congratulation You have won Rs.10");
//         }
if (inputno==number){
    System.out.format("You guessed it right it was %d\n You gussed in %d attempts\n",number,noofGuesses);
    return true;
}
else if (inputno<number){
    System.out.println(" The Number that you have gussed is too less. Guess Again");
}else if (inputno>number){
    System.out.println("The Number that you have gussed is too high. Guess Again");
}
return false;
     }
 }
public class Tut_43_GuessTheNo_game {
    public static void main(String[] args) {
GuessGame g=new GuessGame();
        boolean b=false;
        while (!b){
g.TakeuserInput();
b=g.Iscorrect();
    }
}
 }

