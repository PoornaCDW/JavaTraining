public class Day1_8 {
	public static void main(String[] args) {
		int a[] = new int[]{10, 20, 23, 90, 7};
		int position = findPosition(a, 20);
		System.out.println("Found at position : "+(++position));
	}
	
	public static int findPosition(int a[], int key) {
		int pos = -1;
		for(int i=0; i<a.length; i++) {
			if(a[i] == key)
				pos = i;
		}
		return pos;
	}
}