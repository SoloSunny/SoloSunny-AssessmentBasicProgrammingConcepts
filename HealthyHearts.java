/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solomonkudus.milestone1assignment;

import java.util.Scanner;

/**
 *
 * @author Solomon Kudus
 */
public class HealthyHearts {
  
  public static void main(String[] args) {
    Scanner inputReader = new Scanner(System.in);
    int age,maximum;
    double target,target1;
     
    System.out.println("What is your age?");
     age = Integer.parseInt(inputReader.nextLine());
     maximum=220 - age;
     target=  (maximum * 0.5);
     target1= (maximum * 0.85);
     System.out.println("Your maximum heart rate should be "+maximum+" beats per minute. ");
     
    System.out.println("Your target HR Zone is "+Math.round(target)+" -  "+Math.round(target1)+"  beats per minute. ");
     
    }    
        
}


/*
Make a simple calculator that asks the user for their age. Then calculate the healthy heart rate range for that age, and display it.

Their maximum heart rate should be 220 - their age.
The target heart rate zone is the 50 - 85% of the maximum.
*/


  

