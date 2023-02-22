import java.util.InputMismatchException;
import java.util.Scanner;

public class Day4_7b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerator = 0, denominator;
        while(true) {
            System.out.println("Enter the numerator:");
            try {
                numerator = sc.nextInt();
            }  catch(InputMismatchException e) {
                return;
            }
            System.out.println("Enter the denominator:");
            denominator = sc.nextInt();
            testDivisionOperation(numerator, denominator);
        }
    }

    public static void testDivisionOperation(int numerator, int denominator) {
        try {
            if(denominator == 0) {
                throw new ArithmeticException();
            }
            else if(numerator == 'q' || denominator == 'Q') {
                System.exit(0);
            }
            else {
                System.out.println("Quotient  - "+((float)numerator/denominator));
            }
        } catch(ArithmeticException exception) {
            System.out.println("Poor input data!");
            System.out.println(exception);
        }
    }
}