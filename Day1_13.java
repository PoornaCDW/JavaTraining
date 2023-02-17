package exersice_1;
import java.util.*;

public class Day1_13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enetr the numbers of students : ");
		n = sc.nextInt();
		int students[][] = new int[n][6];
		System.out.println("Enter the student number following their marks in 4 subjects: ");
		for(int i=0; i<n; i++) {
			for(int j=0; j<5; j++)
				students[i][j] = sc.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			for(int j=1; j<5; j++) {
				students[i][5] += students[i][j];
			}
		}
		
		System.out.println("Student details:");
		for(int i=0; i<n; i++) {
			System.out.println("");
			for(int j=0; j<6; j++) {
				System.out.print(" "+students[i][j]);
			}
		}
	}
}