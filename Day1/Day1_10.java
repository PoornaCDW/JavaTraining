public class Day1_10 {
	public static void main(String[] args) {
		int a[][] = new int[4][4];
		int n=0;
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++)
				a[i][j] = ++n;
		}
		System.out.println("Matrix:");
		for(int i=0; i<4; i++) {
			System.out.println("");
			for(int j=0; j<4; j++)
				System.out.print(" "+a[i][j]);
		}
	}
}