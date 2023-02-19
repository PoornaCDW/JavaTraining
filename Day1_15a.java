public class Day1_15a {
	public static void main(String[] args) {
		System.out.println("Prime numbers from 1 to 100.");
		for(int i=2; i<=100; i++)
			primeOrNot(i);
	}
	
	public static void primeOrNot(int n) {
		boolean testPrime = false;
		for(int i = 2; i <= n/2; ++i) {
			if(n%i == 0) {
				testPrime = true;
				break;
			}
		}
		if(!testPrime)
			System.out.print(" "+n);
	}
}