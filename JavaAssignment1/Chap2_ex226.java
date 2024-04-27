
/*
 * (Multiples) Write an application that reads two integers, 
 * determines whether the first is a multiple of the second 
 * and prints the result. 
 * [Hint: Use the remainder operator.]
 */

 import java.util.Scanner;

 public class Chap2_ex226 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
 
         // enter two integers
         System.out.print("Enter the first integer: ");
         int Number1 = input.nextInt();
 
         System.out.print("Enter the second integer: ");
         int Number2 = input.nextInt();
 
         // Check if the first number is a multiple of the second number and Print the result
         if (Number1 % Number2 == 0) {
             System.out.println(Number1 + " is a multiple of " + Number2);
         } else {
             System.out.println(Number1 + " is not a multiple of " + Number2);
         }
 
         input.close(); // Close the scanner
     }
 }
 