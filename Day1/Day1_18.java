public class Day1_18 {
    public static void main(String[] args) {
        int n = 124;
        n = reverseNumber(n);
        convert(n);
    }

    public static int reverseNumber(int n) {
        int d, rev = 0;
        while(n != 0) {
            d = n % 10;
            rev = rev * 10 + d;
            n /= 10;
        }
        return rev;
    }

    public static void convert(int n) {
        String []alps = new String[] {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Zero"};
        int d;
        while(n!=0) {
            d = n%10;
            for(int i=0; i<alps.length; i++) {
                if(d == i+1)
                    System.out.print(" "+alps[i]);
            }
            n /= 10;
        }
    }
}