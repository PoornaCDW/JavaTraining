import java.util.Scanner;

public class Day4_7b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numerator, denominator;
        while(true) {
            System.out.println("Enter the numerator:");
            numerator = sc.next();
            if(numerator.equals("q") || numerator.equals("Q")) {
                break;
            }
            System.out.println("Enter the denominator:");
            denominator = sc.next();
            testDivisionOperation(numerator, denominator);
        }
    }

    public static void testDivisionOperation(String numerator, String denominator) {
        try {
            if(denominator.equals("0")) {
                throw new ArithmeticException();
            }else {
                System.out.println("Quotient  - "+((float)Integer.parseInt(numerator)/Integer.parseInt(denominator)));
            }
        } catch(ArithmeticException exception) {
            System.out.println("Division by zero!");
            System.out.println(exception);
        } catch(NumberFormatException exception) {
            System.out.println("Poor input data!");
            System.out.println(exception);
        }
    }
}