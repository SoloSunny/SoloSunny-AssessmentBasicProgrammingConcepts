/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solomonkudus.milestone1assignment;

/**
 *
 * @author Solomon Kudus
 */
public class SummativeSums {
    public static void main(String[] args) {
     int[] array1 =     { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
     int[] array2 = { 999, -60, -77, 14, 160, 301 };
             int[] array3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99 } ;
    
           //  Call your new method inside a main method and print out the result
             int s1=sums(array1);
             int s2=sums(array2);
             int s3=sums(array3);
               
    System.out.println(" Array 1 Final sum: " + s1);
    System.out.println(" Array 2 Final sum: " + s2);
    System.out.println(" Array 3 Final sum: " + s3);

}
      
        // Write a static method that takes in an array of ints, adds them together, and returns the result.
        public static int sums(int[] numbers){
            
               int sum = 0; // keep running total
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
           
        }
            
        return sum;
}
}

/*Write a static method that takes in an array of ints, adds them together, and returns the result.
Call your new method inside a main method and print out the result for the following three example arrays:

    { 1, 90, -33, -55, 67, -16, 28, -55, 15 }
{ 999, -60, -77, 14, 160, 301 }
{ 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99 } 

What You Should See
#1 Array Sum: 42
#2 Array Sum: 1337
#3 Array Sum: 2001  

*/