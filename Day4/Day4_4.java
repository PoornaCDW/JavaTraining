import java.util.Scanner;

public class Day4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int voter;
        System.out.println("Enter the age of the voter:");
        voter = sc.nextInt();
        try {
            if(voter >= 18)
                System.out.println("Eligible to vote!");
            else
                throw new AgeException("Not eligible to vote as his age is less than 18.");
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}

class AgeException extends Exception {
    String msg;
    
    AgeException(String msg) {
        super(msg);
        this.msg = msg;
    }
}