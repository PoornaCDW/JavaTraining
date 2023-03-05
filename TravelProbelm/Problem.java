package TravelProbelm;

import java.time.*;

public class Problem {
    public static void main(String[] args) {
        HolidayStrategy holidayStrategy = Year.now().isLeap() ? new LeapYearHolidayStrategy() : new DefaultHolidayStrategy();

        TransportLorry lorry = new TransportLorry(180, 8, holidayStrategy);

        // Example usage
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        double distance = 1400;

        LocalDateTime arrivalTime = lorry.calculateArrivalTime(date, time, distance);

        System.out.println("The lorry will arrive on:");
        System.out.println("Date "+arrivalTime.toString());
    }
}
