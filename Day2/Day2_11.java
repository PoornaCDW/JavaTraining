class A {
    int a;
    
    A(int X) {
        System.out.println("Constructor of A!");
    }
}

class B{
    int b;
    B(int X) {
        b = X;
        System.out.println("Constructor of B!");
    }
}

class C extends A {
    C() {
        this.a = 10;
        B obj = new B(100);
    }
}

public class Day2_11 {
    public static void main(String[] args) {
        C object = new C();
    }
}

/*

The program throws an error as the super class of C that is A cannot be extended with a
default constructor.
The error thrown:
Day2_11.java:17: error: constructor A in class A cannot be applied to given types;
    C() {
        ^
  required: int
  found:    no arguments
  reason: actual and formal argument lists differ in length
1 error

Can be rectified by adding an empty default constructor and carrying out the 
initialisation in the C constructor itself.

*/