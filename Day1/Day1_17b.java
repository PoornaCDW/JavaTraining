public class Day1_17b {
    static int x;
    public static void main(String[] args) {
        x = 100;
        System.out.println("Main function!");
        Day1_17b d = new Day1_17b();
        d.printStatic();
    }

    void printStatic() {
        System.out.println("X = "+x);
    }
}