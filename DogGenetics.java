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
public class DogGenetics {
   public static void main(String[] args) {
        
 
  Scanner inputReader = new Scanner(System.in);
  Random background = new Random();
 
String dname1= " St.bernard";
String dname2= " Siberian";
String dname3= " Sustralian";
String dname4= " Sheep";
String dname5= " Papillon";


int b1;
int b2;
int b3;
int b4;
int b5;
int breedSum;
 String MYdogName;
do{
  System.out.println("What is your dog's name?(name must contain only letters, thank you)");
         MYdogName=inputReader.nextLine();  
} 
while(!MYdogName.matches("[a-zA-Z_]+"));
        
          System.out.println("Well then, I have this highly reliable report on "+MYdogName+"'s prestigious background right here.");
         
 do {

b1 = background.nextInt(100);
b2 = background.nextInt(100);
b3 = background.nextInt(100);
b4 = background.nextInt(100);
b5 = background.nextInt(100);
 
 breedSum=(b1+b2+b3+b4+b5);
  }
  while (breedSum != 100);
   
          System.out.println(MYdogName+" is:");
          System.out.println("");
          System.out.println(""+b1+"%"+ dname1);
          System.out.println(""+b2+"%" +dname2);
          System.out.println(""+b3+"%"+dname3);
          System.out.println(""+b4+"%"+dname4);
          System.out.println(""+b5+"%"+dname5);
          System.out.println("Total:" + breedSum);
          System.out.println("");
          System.out.println("Wow, that's QUITE the dog!");
                     
    }
   
} 

