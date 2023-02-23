public class Day4_2 {
    public void mth1() {
        mth2();
        System.out.println("caller");
    }

    public void mth2() {
        try {
            //throw new Exception();
            return;
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

Output of the program:
finally-mth2
caller

Output of the proogram after replacing return with a throw statement we get the following output:
catch-mth2
finally-mth2
caller

*/