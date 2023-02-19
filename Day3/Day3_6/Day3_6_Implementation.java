package Day3_6;

public class Day3_6_Implementation extends Day3_6{
    public void myMethod() {
        myProtectedMethod();
    }

    public static void main(String[] args) {
        Day3_6_Implementation I = new Day3_6_Implementation();
        I.myMethod();
    }
}