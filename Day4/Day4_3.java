public class Day4_3 {
    public void mth1() {
        mth2();
        System.out.println("caller");
    }

    public void mth2() {
        try {
            //throw new Exception();
            System.exit(0);
        } catch(Exception e) {
            System.out.println("catch-mth2");
        } finally {
            System.out.println("finally-mth2");
        }
    }

    public static void main(String[] args) {
        Day4_2 d = new Day4_2();
        d.mth1();
    }
}

/*

We get an error as follows:
Day4_3.java:10: error: unreachable statement
            System.exit(0);
            ^
1 error,
as we have another statement that is throw.

If we remove that we get the following output:
atch-mth2
finally-mth2
caller

*/