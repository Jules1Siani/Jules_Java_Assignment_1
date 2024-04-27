
/*
 (Comparing Integers) Write an application that asks the user
 to enter two integers, obtains them from the user and displays
 the larger number followed by the words "is larger". 
 If the numbers are equal, print the message 
 "These numbers are equal". Use the techniques shown in Fig. 2.15.
 */

 
 import java.util.Scanner; // program uses class Scanner 
 
  public class Chap2_ex216 { 
    // main method begins execution of Java application 
     public static void main(String[] args) { 
       
        // create Scanner to obtain input from command line 
        Scanner input = new Scanner(System.in);

    System.out.print("Enter first integer:"); // prompt 
        
        int number1 = input.nextInt(); // read first number from user

    System.out.print("Enter second integer:"); // prompt
        int number2 = input.nextInt(); // read second number from user

    if (number1 > number2) { // compar number1 and number2
      System.out.println(number1 + " is larger."); // print the message 
         }
        
    if (number1 < number2) { 
      System.out.println(number2 + " is larger.");        
         }

    else {
      System.out.println("These numbers are equal.");
        }

    
     } // end method main  
} // end class Comparison