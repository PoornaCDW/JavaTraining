package TravelProbelm;

import java.time.*;
import java.util.Calendar;

class TransportLorry {
    private final int TWO;
    private final int speed;
    private final double maxDriveTime;
    private final HolidayStrategy holidayStrategy;

    public TransportLorry(int speed, HolidayStrategy holidayStrategy) {
        this.speed = speed;
        this.maxDriveTime = 8 * 60;
        this.holidayStrategy = holidayStrategy;
        this.TWO = 2;
    }

    public LocalDateTime calculateArrivalTime(LocalDate date, LocalTime time, double distance) {
        if (holidayStrategy.isHoliday(date)) {
            System.out.println("This is a holiday");
            return null;
        }

        double travelTime = distance / speed * 60;

        LocalDateTime startDateTime = LocalDateTime.of(date, time);
        if (startDateTime.getDayOfWeek() == DayOfWeek.SATURDAY) {
            startDateTime = startDateTime.withHour(12);
        } else {
            startDateTime = startDateTime.withHour(8);
        }

        double remainingDriveTime = Math.min(maxDriveTime, travelTime);
        LocalDateTime endDateTime = startDateTime.plusMinutes((long) remainingDriveTime);

        if (endDateTime.getDayOfWeek() == DayOfWeek.SUNDAY) {
            System.out.println("Driving will continue on Sunday");
            endDateTime = endDateTime.withHour(12);
        }

        if (Calendar.WEEK_OF_MONTH == TWO && date.getDayOfWeek() == DayOfWeek.SATURDAY) {
            System.out.println("This is the second Saturday");
            return null;
        }

        return endDateTime;
    }
}