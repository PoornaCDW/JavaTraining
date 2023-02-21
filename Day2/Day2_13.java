abstract class Test {
}

public class Day2_13 {
    public static void main(String[] args) {
        Test t = new Test();
    }
}

/*

It is verified that we cannot create instances of the class as this program threw the following error:
Day2_13.java:7: error: Test is abstract; cannot be instantiated
        Test t = new Test();
                 ^
1 error

*/