import java.util.Scanner;

public class Day4_5 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int voter;
        System.out.println("Enter the age of the voter:");
        voter = sc.nextInt();
        toThrow(voter);
    }

    public static void toThrow(int voter) throws Exception {
        if(voter>=18)
            System.out.println("Eligible to vote!");
        else
            throw new AgeException("Not eligible to vote!");
    }
}

class AgeException extends Exception {
    String msg;
    
    AgeException(String msg) {
        super(msg);
        this.msg = msg;
    }
}

/*

As the above method toThrow() throws an exception and it is not caught
we get the following error:
Day4_5.java:9: error: unreported exception Exception; must be caught or declared to be thrown
        toThrow(voter);
               ^
1 error

If we add throws exception to the main method aswell we get the follow exception during runtime:
Enter the age of the voter:
6
Exception in thread "main" AgeException: Not eligible to vote!
        at Day4_5.toThrow(Day4_5.java:16)
        at Day4_5.main(Day4_5.java:9)

*/