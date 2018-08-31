//Check the entered number is Armstrong number 
package com.shariful.nov5.extra_assignment;
import java.util.Scanner;
 
class Ques02
{
   private static Scanner sc;

public static void main(String args[])
   {
      int input, sum = 0, temp, remainder;
 
      sc = new Scanner(System.in);
      System.out.println("Enter a number to check if it is an Armstrong number");      
      input = sc.nextInt();
 
      temp = input;
 
      while (temp != 0) {
         remainder = temp%10;
         sum = sum + remainder*remainder*remainder;
         temp = temp/10;
      }
 
      if (input == sum)
         System.out.println(input + " is an Armstrong number.");
      else
         System.out.println(input + " is not an Armstrong number.");         
   }
 
}
