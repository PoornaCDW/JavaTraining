import java.util.*;

public class Day1_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the number n :");
		n = sc.nextInt();
		averageOfN(n);
	}
	
	public static void averageOfN(int n) {
		int sum = 0;
		for(int i=1; i<=n; i++)
			sum += i;
		System.out.println("Average of n numbers : "+((float)sum/n));
	}
}