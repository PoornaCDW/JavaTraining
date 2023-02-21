public class Day2_7 {
    final int x;

    public Day2_7(int x) {
        this.x = x;
    }

    public int getValue() {
        return x;
    }

    public static void main(String[] args) {
        final Day2_7 obj = new Day2_7(10);
        System.out.println("Initial value: " + obj.getValue());
        obj.setValue(20);
        System.out.println("Updated value: " + obj.getValue());
    }

    public void setValue(int newValue) {
        this.x = newValue;
    }
}

/*

The program throws an error as it is not possible to reassign a new
value to a final variable i.e.,

Day2_7.java:20: error: cannot assign a value to final variable x
        this.x = newValue;
            ^
1 error

*/