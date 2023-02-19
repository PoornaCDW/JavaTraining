class One {
    protected int a;
    protected int b;

    One() {
        a = 10;
        b = 20;
    }
}

class Two extends One {
    public void manipulate() {
        a += 5;
        b += 10;
        System.out.println("A = "+a);
        System.out.println("B = "+b);
    }
}

public class Day1_23 {
    public static void main(String[] args) {
        Two t = new Two();
        t.manipulate();
    }
}