class Complex {
    int realPart;
    int imaginaryPart;

    Complex(int realPart, int imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public void addComplex(int realPart, int imaginaryPart) {
        this.realPart += realPart;
        this.imaginaryPart += imaginaryPart;
    }

    public void printComplexNumber() {
        System.out.println("Complex number : "+this.realPart+" + i"+this.imaginaryPart);
    }
}

public class Day2_2 {
    public static void main(String[] args) {
        Complex c = new Complex(4, 2);
        c.printComplexNumber();
        c.addComplex(6, 7);
        System.out.println("After adding 6 + i7 : ");
        c.printComplexNumber();
    }
}