public class Day1_26 {
    public static void main(String[] args) {
        int i = -243;
        int j = 243;
        if(i == j)
            System.out.println(" numbers are the same ");
    }
}

/*

The following code gives the output:
" numbers are the same " even though the numbers are not because the if loop is closed with ; hence the print statement
doesn't come under the if condition.

We can rectify it by removing the ";" at the end of the if condition.

*/