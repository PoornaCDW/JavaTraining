import java.util.Scanner;

public class Day4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks;
        System.out.println("Enter the marks in Maths out of 100:");
        marks = sc.nextInt();
        try {
            if(marks >= 33)
                System.out.println("The student has sucessfully passed in Maths!");
            else
                throw new MarksException("The student has failed in maths!");
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}

class MarksException extends Exception {
    String msg;
    
    MarksException(String msg) {
        super(msg);
        this.msg = msg;
    }
}