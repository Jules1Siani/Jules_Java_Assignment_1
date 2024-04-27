
/*
 * (Negative, Positive and Zero Values) Write a program
 *  that inputs five numbers and determines and prints 
 * the number of negative numbers input, the number of 
 * positive numbers input and the number of zeros input.
 */
import java.util.Scanner;

public class Chap2_ex232 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // Initialize counters
        int negativeCount = 0;
        int positiveCount = 0;
        int zeroCount = 0;

        // Input five numbers using a while loop
        int count = 0;
        while (count < 5) {
            System.out.print("Enter a number: ");
            int number = input.nextInt();

            // Check if the number is negative, positive, or zero
            if (number < 0) {
                negativeCount++;
            } else if (number > 0) {
                positiveCount++;
            } else {
                zeroCount++;
            }

            count++;
        }

        // Print the counts
        System.out.println("Number of negative numbers: " + negativeCount);
        System.out.println("Number of positive numbers: " + positiveCount);
        System.out.println("Number of zero values: " + zeroCount);

        input.close(); // Close the scanner
    }
}