
//What does the following program do?
/*
 1   // Exercise 5.10: Printing.java
 2   public class Printing {
 3      public static void main(String[] args) {
 4         for (int i = 1; i <= 10; i++) {
 5            for (int j = 1; j <= 5; j++) {
 6               System.out.print('@');
 7            }
 8
 9            System.out.println();
10         }
11      }
12   }

 */

 /*
  This Java program prints a pattern of '@' characters in a grid-like format. Here's what happens:

* The 'main' method is the entry point of the program.
* The outer loop, controlled by variable i, runs from 1 to 10 (inclusive).
* Inside the outer loop, there's an inner loop, controlled by variable j, which runs from 1 to 5 (inclusive).
* Within the inner loop, the program prints the '@' character using System.out.print('@').
* After printing five '@' characters, the inner loop finishes and moves to the next line using System.out.println().
* This process repeats 10 times due to the outer loop.


As a result, the program prints 10 lines, each containing five '@' characters, forming a rectangular grid pattern.

  */