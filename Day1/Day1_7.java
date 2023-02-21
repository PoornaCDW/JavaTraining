import java.util.*;

public class Day1_7 {
    public static void main(String[] args) {
        int []arr = new int[] {56, 9, -100, -87, 88};
        System.out.println("Array before sorting:");
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Array after sorting in ascending order:");
        System.out.println(Arrays.toString(arr));
        //Arrays.sort(arr, 1, 5, Collections.reverseOrder());
        reverse(arr);
        System.out.println("Array after sorting in descending order:");
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