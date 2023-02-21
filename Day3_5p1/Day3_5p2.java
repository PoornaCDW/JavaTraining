import Day3_5p1.Day3_5p1;

class MyClass implements Day3_5p1 {
    public void method1() {
        System.out.println("Implementing method1");
    }

    public void method2() {
        System.out.println("Implementing method2");
    }

    public void method3() {
        System.out.println("Implementing method3");
    }
}

public class Day3_5p2 {
    public static void main(String[] args) {
        Day3_5p1 obj = new MyClass();
        obj.method1();
        obj.method2();
        obj.method3();
    }
}