public class Day2_6 {
    static {
        System.out.println("Static block!");
    }    
    
    Day2_6() {
        System.out.println("In constructor!");
    }

    public static void main(String[] args) {
        Day2_6 o = new Day2_6();    
    }
}
