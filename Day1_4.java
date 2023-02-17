package exersice_1;
import java.util.*;

public class Day1_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the number : ");
		n = sc.nextInt();
		if(primeOrNot(n)) {
			System.out.println("Not a prime number!");
		}
		else {
			System.out.println("Prime number!");
		}
	}
	
	public static boolean primeOrNot(int n) {
		boolean testPrime = false;
		for(int i = 2; i <= n/2; ++i) {
			if(n%i == 0) {
				testPrime = true;
				break;
			}
		}
		return testPrime;
	}
}