
/*
 *  (Arithmetic, Smallest and Largest) Write an application 
 * that inputs three integers from the user and displays the sum, 
 * average, product, smallest and largest of the numbers. 
 * Use the techniques shown in Fig. 2.15. 
 * [Note: The calculation of the average in this exercise should 
 * result in an integer representation of the average. So, if the 
 * sum of the values is 7, the average should be 2, not 2.3333….]
 */

 import java.util.Scanner; // program uses class Scanner 
 
  public class Chap2_ex217 { 
    // main method begins execution of Java application 
     public static void main(String[] args) { 
       
        // create Scanner to obtain input from command line 
        Scanner input = new Scanner(System.in);

    System.out.print("Enter first integer:"); // prompt 
        int number1 = input.nextInt(); // read first number from user

    System.out.print("Enter second integer:"); // prompt
        int number2 = input.nextInt(); // read second number from user

    System.out.print("Enter third integer:"); // prompt
        int number3 = input.nextInt(); // read third number from user

    // sum, average, product, smallest and largest of the numbers
        int sum = number1 + number2 + number3; 
          System.out.println("Sum: " + sum);

        int average = (number1 + number2 + number3) / 3;
          System.out.println("Average: " + average);
        
        int product = (number1 * number2 * number3);
          System.out.println("Product: " + product);

    if (number1 < number2 && number1 < number3) { // compar to find the smallest
      System.out.println(number1 + " is smalest."); // print the message 
         }
    
    if (number2 < number1 && number2 < number3) { // compar to find the smallest
      System.out.println(number2 + " is smalest."); // print the message 
          }
        
    if (number3 < number1 && number3 < number2) { // compar to find the smallest
      System.out.println(number3 + " is smalest."); // print the message 
          }

    if (number1 > number2 && number1 > number3) { // compar to find the smallest
          System.out.println(number1 + " is largest."); // print the message 
             }
        
    if (number2 > number1 && number2 > number3) { // compar to find the smallest
          System.out.println(number2 + " is largest."); // print the message 
              }
            
    if (number3 > number1 && number3 > number2) { // compar to find the smallest
          System.out.println(number3 + " is largest."); // print the message 
              }
    
     } // main  
} // class