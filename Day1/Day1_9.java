import java.util.*;

public class Day1_9 {
	public static void main(String[] args) {
		int []arr = new int []{1, 2, 3, 4, 5, 6};
		System.out.println("Array before reverse operation: ");
		System.out.println(Arrays.toString(arr));
		reverse(arr);
		System.out.println("Array after reverse operation: ");
		System.out.println(Arrays.toString(arr));
	}
	
	public static void reverse(int []a) {
		int f=0, l=a.length-1;
		while(f<l) {
			int t = a[f];
			a[f] = a[l];
			a[l] = t;
			f++;
			l--;
		}
	}
}