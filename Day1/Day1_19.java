import java.util.*;

public class Day1_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        System.out.println("Enter the contents of the matrix:");
        for(int i=0; i<3; i++)
            for(int j=0; j<3; j++)
                arr[i][j] = sc.nextInt();
        sc.close();
        reverseRows(arr);
        System.out.println("Array after reverse operation : ");
        for(int i[] : arr) {
            System.out.println();
            for(int j: i)
                System.out.print(" "+j);
        }
    }

    public static void reverseRows(int arr[][]) {
        for(int i=0; i<3; i++) {
            int f = 0, l = 2;
            while(f<l) {
                int t = arr[i][f];
                arr[i][f] = arr[i][l];
                arr[i][l] = t;
                f++;
                l--;
            }
        }
    }
}