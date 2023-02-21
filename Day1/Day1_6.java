import java.util.*;;

public class Day1_6 {
    public static void main(String []args) {
        int arr[] = new int[] {10, 20, 40, 50, 60};
        int brr[] = new int[10];
        System.out.println(Arrays.toString(arr));
        System.arraycopy(arr, 0, brr, 0, 5);
        arr = null;
        System.out.println(Arrays.toString(brr));
    }
}