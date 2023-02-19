class A {
    public int a;
    private int b;
    protected int c;

    public void getValues() { 
        System.out.println("["+a+", "+b+", "+c+"]");
    }

    private void privateMethod() {
        System.out.println("In private method.");
    }

    protected void protectedMethod() {
        System.out.println("In protected method.");
    }
}

class B extends A {
    int x;

    B() {
        x = 10;
    }

    public void methodB() {
        System.out.println("In class B method.");
    }

    void getValue() {
        System.out.println(" X = "+x);
    }

    void observation() {
        a = 100;
        this.privateMethod();
        this.protectedMethod();
    }

}

public class Day2_9 {
    public static void main(String[] args) {
        B obj = new B();
        obj.methodB();
        obj.getValue();
        obj.observation();
    }   

}

/*

It is posiible to access the public and protected members whereas accessing the private
members will throw the following kind of error(s):

Day2_9.java:36: error: cannot find symbol
        this.privateMethod();
            ^
  symbol: method privateMethod()

*/