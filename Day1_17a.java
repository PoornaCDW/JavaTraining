public class Day1_17a {
    public static void main(String[] args) {
        final int x = 100;
        x = 10;
        System.out.println(x);
    }
}

/*

It is not possible to modify a const member as it throws the following error:
Day1_17a.java:4: error: cannot assign a value to final variable x
        x = 10;
        ^
1 error

*/