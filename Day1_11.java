package exersice_1;

public class Day1_11 {
	public static void main(String[] args) {
		int pattern = 1;
		int a[][] = new int[4][4];
		for(int i=0; i<4; i++) {
			for(int j=0; j<=i; j++)
				a[i][j] = pattern++;
		}
		for(int i = 0; i<4; i++) {
			for(int j=0; j<4; j++) {
				if(a[i][j]!=0)
					System.out.print(" "+a[i][j]);
			}
			System.out.println("");
		}
	}
}