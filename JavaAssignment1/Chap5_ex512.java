
/*
(Calculating the Product of Odd Integers) Write an application 
that calculates the product of the odd integers from 1 to 15.
 */

 public class Chap5_ex512 {
    public static void main(String[] args) {
        // Initialize the product to 1
        int product = 1;
        
        // Iterate over the numbers from 1 to 15
        for (int i = 1; i <= 15; i++) {
            // Check if the number is odd
            if (i % 2 != 0) {
                // Multiply the product by the odd number
                product *= i;
            }
        }
        
        // Print the product of the odd integers
        System.out.println("Product of odd integers from 1 to 15: " + product);
    }
}
