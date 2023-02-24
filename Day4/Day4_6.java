public class Day4_6 {
    public static void main(String[] args) throws Exception{
        Derived d = new Derived();
    }
}

class Base {
    int n;
    Base() throws Exception {
        System.out.println("In base class constructor.");
        n = 10;
        n /= 0;
    }
}

class Derived extends Base {
    Derived() throws Exception{
        super();
    }
}

/*

When we compile the following program we get the following error:
Day4_6.java:17: error: unreported exception Exception; must be caught or declared to be thrown
    Derived() {
         
Hence, the derived class constructor is not catching the exception thrown by the base class constructor.

*/