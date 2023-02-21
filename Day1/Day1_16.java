import java.util.*;

public class Day1_16 {
    public static void main(String[] args) {
        int a[] = new int[] {10, 70, 10, 989, 22, 10};
        findPosition(a, 11);
    }

    public static void findPosition(int a[], int key) {
		int count = 0, k = 0;
		for(int i=0; i<a.length; i++) {
			if(a[i] == key)
                count++;
		}
        
        int pos[] = new int[count];

        for(int i=0; i<a.length; i++) {
			if(a[i] == key) {
                pos[k] = i;
                k++;
            }
		}

        if(count == 0) {
            System.out.println("Not found.");
        }
        else {
            System.out.println("Element found "+count+" times!");
            System.out.println("At positions:"+Arrays.toString(pos));
        }
	}
}