import java.util.Scanner;

class quadraticEquation {
    int a;
    int b;
    int c;

    quadraticEquation() {
        a = b = c = 1;
    }

    quadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    int getA() {
        return a;
    }

    int getB() {
        return b;
    }

    int getC() {
        return c;
    }

    void set(int A, int B, int C) {
        a = A;
        b = B;
        c = C;
    }

    int compute(int x) {
        int fx;
        fx = (a*x*x) + (b*x) + c;
        return fx;
    }
}

public class Day1_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, x;
        quadraticEquation qe = new quadraticEquation();
        System.out.println("Enter the coefficients of the equation(a, b, c) : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        qe.set(a, b, c);
        System.out.println("Enter the value of x : ");
        x = sc.nextInt();
        System.out.println("Value of f(x) = "+qe.compute(x));
        sc.close();
    }   
}