/**
 * This program calculates the factorial of a given number.
 * The factorial of a non-negative integer n is the product of all positive integers less than or equal to n.
 */
public class Day1_14a {
    /**
     * Calculates the factorial of a given number.
     * @param n The number to calculate the factorial of
     * @return The factorial of n
     */
    public static int factorial(int n) {
       if (n == 0) {
          return 1;
       } else {
          return n * factorial(n-1);
       }
    }
 
    /**
     * Main method to test the factorial() method.
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
       int n = 5;
       int result = factorial(n);
       System.out.println("The factorial of " + n + " is " + result);
    }
 }
 