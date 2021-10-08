/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solomonkudus.milestone1assignment;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Solomon Kudus
 */
public class RockPaperScissors {
    
public static void main(String[] args) {

          Scanner inputReader = new Scanner(System.in);
           
    String continueGame="y";   
    int rounds=0;
    int win=0;
            int lose=0;
            int tie=0;
            int comp=0;
            int choice;
                
       System.out.println("Welcome to the ROCK, PAPER, SCISSORS Game!");
       System.out.println(" The rules are as follows:");
       System.out.println("* Rock breaks Scissors.");
       System.out.println("* Paper wrap Rock.");
       System.out.println("* Scissors cut Paper.");
       
     do {
    // The program first asks the user how many rounds he/she wants to play.
       System.out.println("How many round do you want to play?(min :1, max :10)");
       
       rounds=Integer.parseInt(inputReader.nextLine());
    // Maximum number of rounds = 10, minimum number of rounds = 1
    // If the number of rounds is in range, the program plays that number of rounds.
       if ( 0<rounds && rounds<11) {
           for (int i = 0; i < rounds; i++) {
    // The computer asks the user for his/her choice (Rock, Paper, or Scissors). Hint: 1 = Rock, 2 = Paper, 3 = Scissors
               System.out.println("What is your choice?(Rock(1), Paper(2), or Scissors(3)..Please type '1','2' or '3'.");
             choice=Integer.parseInt(inputReader.nextLine()); 
               switch (choice) {
                   case 1:
                       System.out.println("User's     choice:Rock.");
                       break;
                   case 2:
                       System.out.println("User's     choice:Paper.");
                       break;
                   case 3:
                       System.out.println("User's     choice:Scissors.");
                       break;
                   default:
                       break;
               }
            
    // After the computer asks for the user's input, the computer randomly chooses Rock, Paper, or Scissors and displays the result of the round (tie, User win, or Computer win).
              Random rps = new Random();
             int x = rps.nextInt(3)+1;  
             switch (x) {
                   case 1:
                       System.out.println("Computer's choice:Rock.");
                        comp=1;
                       break;
                   case 2:
                       System.out.println("Computer's choice:Paper.");
                         comp=2;
                       break;
                   case 3:
                       System.out.println("Computer's choice:Scissors.");
                         comp=3;
                       break;
                       
               }
               
                       if (choice==comp) {
                           tie++;
                           System.out.println("Tie!!"); 
                       }
 
                       else if (choice==1 && comp==2 ||choice==2 && comp==3||choice==3 && comp==1) {
                           lose++;
                           System.out.println("Computer Win.");
                                  }
    else if (comp==1 && choice==2 ||comp==2 && choice==3||comp==3&& choice==1) {
                     win++;
                          System.out.println("User Win.");
                                 }    
               }
           } 
       // If the user asks for something outside this range, the program prints an error message and quits.
       else     {
           System.out.println("Oops!Sorry "+rounds+" is outside the range, please choise among 1 and 10 range number.");
          System.exit(0); 
       }
       // The program must print out the number of ties, User wins, and Computer wins and declare the overall winner based on who won more rounds.
          System.out.println("Number of Wins : "+win+"."); 
          System.out.println("Number of Lose "+lose+".");
          System.out.println("Number of Ties Games : "+tie+".");
          
          if (win>lose) {
              System.out.println("YOU ARE THE WINNER!!!");
              
       }
          else{
              System.out.println("Sorry, you are not the winner!");
              
          }
          
        // After all rounds have been played and the winner declared, the program must ask the user if he/she wants to play again.
          System.out.println("Do you want to play again?(y/n)");
          continueGame=inputReader.nextLine();
       }
       while("y".equalsIgnoreCase(continueGame));
         
       // If the user says No, the program prints out a message saying, "Thanks for playing!" and then exits.
       System.out.println("Thanks for Playing, see you soon!");
        
       }
}

  

