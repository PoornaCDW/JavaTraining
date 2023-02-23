import java.util.Scanner;

public class Day4_5 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int marks;
        System.out.println("Enter the marks in Maths out of 100:");
        marks = sc.nextInt();
        toThrow(marks);
    }

    public static void toThrow(int marks) throws Exception {
        if(marks >= 33)
            System.out.println("The student has sucessfully passed in Maths!");
        else
            throw new MarksException("The student has failed in maths!");;
    }
}

class MarksException extends Exception {
    String msg;
    
    MarksException(String msg) {
        super(msg);
        this.msg = msg;
    }
}

/*

As the above method toThrow() throws an exception and it is not caught
we get the following error:
Day4_5.java:9: error: unreported exception Exception; must be caught or declared to be thrown
        toThrow(marks);
               ^
1 error

If we add throws exception to the main method aswell we get the follow exception during runtime:
Enter the marks in Maths out of 100:
32 
Exception in thread "main" MarksException: The student has failed in maths!
        at Day4_5.toThrow(Day4_5.java:16)
        at Day4_5.main(Day4_5.java:9)

*/