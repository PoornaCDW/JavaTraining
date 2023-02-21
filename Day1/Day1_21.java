import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class Day1_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year, month;
        System.out.println("Enter the year and month number : ");
        year = sc.nextInt();
        month = sc.nextInt();
        printDays(year, month);
        sc.close();
    }

    public static void printDays(int y, int m) {
        switch(m) {
            case 1: System.out.println("January has 31 days.");
                    break;
            case 2: if(y % 4 == 0)
                        System.out.println("It is a leap year hence February has 29 days.");
                    else
                        System.out.println("It isn't a leap year hence February has 28 days.");
                    break;
            case 3: System.out.println("March has 31 days.");
                    break;
            case 4: System.out.println("April has 30 days.");
                    break;
            case 5: System.out.println("May has 31 days.");
                    break;
            case 6: System.out.println("June has 30 days.");
                    break;
            case 7: System.out.println("July has 31 days.");
                    break;
            case 8: System.out.println("August has 31 days.");
                    break;
            case 9: System.out.println("September has 30 days.");
                    break;
            case 10: System.out.println("October has 31 days.");
                     break;
            case 11: System.out.println("November has 30 days.");
                     break;
            case 12: System.out.println("December has 31 days.");
                     break;
        }
    }

}