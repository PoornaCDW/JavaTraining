import java.util.*;

public class Day1_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        System.out.println("Enter the contents of the matrix:");
        for(int i=0; i<3; i++)
            for(int j=0; j<3; j++)
                arr[i][j] = sc.nextInt();
        sc.close();
        largestRows(arr);
        // System.out.println("Array after reverse operation : ");
        // for(int i[] : arr) {
        //     System.out.println();
        //     for(int j: i)
        //         System.out.print(" "+j);
       // }
    }

    public static void largestRows(int arr[][]) {
        int largerst[] = new int[3];
        for(int i=0; i<3; i++) {
            int l = 0;
            for(int j=0; j<3; j++) {
                l = arr[i][0];
                if(l<arr[i][j])
                    l = arr[i][j];
            }
            largerst[i] = l;
        }
        System.out.println("Largest in each row: "+Arrays.toString(largerst));
    }
}