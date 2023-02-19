public class Day1_22 {
    public static void main(String[] args) {
        Test t = new Test();
        //t.b = 10;
        t.c = 12;
        t.sum();
        t.pubPrint();
    }
}

class Test {
    private int b;
    protected int c;
    
    Test() {
        b = 2;
        c = 22;
    }

    void sum() {
        System.out.println("In default method.");
        System.out.println("Sum : "+(b+c));
    }

    public void pubPrint() {
        System.out.println("In public method.");
    }
}


/*
Private methods or members cannot be accesed outside the class it throws:
Day1_22.java:4: error: b has private access in Test
        t.b = 10;
         ^
1 error

All other modifiers are accesiible with the output:
In default method.
Sum : 14
In public method.
*/