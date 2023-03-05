package TravelProbelm;

import java.time.*;
import java.util.Calendar;

class TransportLorry {
    private final int TWO;
    private final double speed;
    private final int dailyDriveTime;
    private final HolidayStrategy holidayStrategy;

    public TransportLorry(double speed, int dailyDriveTime, HolidayStrategy holidayStrategy) {
        this.TWO = 2;
        this.speed = speed;
        this.dailyDriveTime = dailyDriveTime;
        this.holidayStrategy = holidayStrategy;
    }

    public LocalDateTime calculateArrivalTime(LocalDate startDate, LocalTime startTime, double distance) {
        LocalDate currentDate = startDate;
        LocalTime currentTime = startTime;
        double remainingDistance = distance;

        while (remainingDistance > 0) {
            if (holidayStrategy.isHoliday(currentDate) ||
                    currentDate.getDayOfWeek() == DayOfWeek.SUNDAY ||
                    (currentDate.getDayOfWeek() == DayOfWeek.SATURDAY && currentTime.isAfter(LocalTime.of(0, 0)) && currentTime.isBefore(LocalTime.of(12, 0)))) {
                // skip holiday or sunday
                currentDate = currentDate.plusDays(1);
                currentTime = LocalTime.of(8, 0); // reset to start of the day
            } else if (Calendar.WEEK_OF_MONTH == TWO && startDate.getDayOfWeek() == DayOfWeek.SATURDAY) {
                // skip second saturday
                currentDate = currentDate.plusDays(1);
                currentTime = LocalTime.of(8, 0); // reset to start of the day
            } else {
                // calculate remaining drive time and distance for the day
                Duration remainingDriveTime = Duration.ofHours(dailyDriveTime).minus(Duration.between(currentTime, LocalTime.of(0, 0)));
                double remainingDriveDistance = remainingDriveTime.toHours() * speed;

                if (remainingDistance <= remainingDriveDistance) {
                    // reach destination within the remaining drive time
                    return LocalDateTime.of(currentDate, currentTime.plus(Duration.ofHours((long) (remainingDistance / speed))));
                } else {
                    // drive to maximum distance and reset to start of the next day
                    remainingDistance -= remainingDriveDistance;
                    currentDate = currentDate.plusDays(1);
                    currentTime = LocalTime.of(8, 0); // reset to start of the day
                }
            }
        }

        // reach destination exactly at the end of the day
        return LocalDateTime.of(currentDate, currentTime.plus(Duration.ofHours(dailyDriveTime)));
    }
}