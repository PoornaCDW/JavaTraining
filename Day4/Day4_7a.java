import java.util.Scanner;

public class Day4_7a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Enter the numerator:");
            int numerator = sc.nextInt();
                  try {
                    System.out.println("Enter the denominator:");
                    int denominator = sc.nextInt();
                    if(denominator == 0)
                        throw new ArithmeticException();
                    testDivisionOperation(numerator, denominator);
                  } catch(ArithmeticException A) {
                    System.out.println(A);
                    continue;
                  }
        }
    }

    public static void testDivisionOperation(int numerator, int denominator) {
        System.out.println("Quotient  - "+((float)numerator/denominator));
    }
}