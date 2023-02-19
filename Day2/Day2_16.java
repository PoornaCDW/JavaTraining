class X {
    void do1() {
        System.out.println("In method do1().");
    }
}

class Y extends X {
    void do2() {
        System.out.println("In method do2().");
    }
}

public class Day2_16 {
    public static void main(String[] args) {
        X x1 = new X();
        X x2 = new Y();
        Y y1 = new Y();
        ((Y)x2).do2();
    }
}