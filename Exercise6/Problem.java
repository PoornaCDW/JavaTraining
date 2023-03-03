package Exercise6;

import java.time.LocalDate;
import java.time.LocalTime;

public class Problem {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();

        CalculateTime forLorry1 = new CalculateTime(200, 80, localTime, localDate);

        forLorry1.calulateDuration();
    }
}