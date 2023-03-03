package Exercise6;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;

class CalculateTime {
    float distanceToDestination;
    float speed;
    LocalTime localTime;
    LocalDate localDate;

    public CalculateTime(float distanceToDestination, float speed, LocalTime localTime, LocalDate localDate) {
        this.distanceToDestination = distanceToDestination;
        this.speed = speed;
        this.localTime = localTime;
        this.localDate = localDate;
    }

    public void calulateDuration() {
        double totalTravelHours = distanceToDestination/speed;
        long totalTravelMinutes = (long)(totalTravelHours * 60);

        boolean isHoliday = holidayCheck(localDate);
        long minutesAvailable = isHoliday ? 0 : 480;
        LocalTime endOfShift = localTime.plusMinutes(minutesAvailable);
        LocalTime timeOfArrival = localTime.plusMinutes(totalTravelMinutes);

        if(checkHolidayTime(localTime)) {
            minutesAvailable = minutesAvailable - (long)((getHolidayTime(localTime)) * 60);
        }

        if(checkHolidayTime(endOfShift)) {
            minutesAvailable = minutesAvailable - (long)((getHolidayTime(endOfShift)) * 60);
        }

        System.out.println("The lorry will reach the destination on "+localDate+" at "+timeOfArrival);
    }
    
    boolean holidayCheck(LocalDate localDate) {
        Calendar calendar = Calendar.getInstance();
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        int weekOfMonth = calendar.get(Calendar.WEEK_OF_MONTH);

        if(dayOfWeek == DayOfWeek.SUNDAY || (dayOfWeek == DayOfWeek.SATURDAY &&  weekOfMonth == 2))
            return true;
        
        return false;
    }

    boolean checkHolidayTime(LocalTime localTime) {
        if(localTime.isAfter(LocalTime.of(0, 0)) && localTime.isBefore(LocalTime.of(12, 0)))
            return true;

        return false;
    }

    double getHolidayTime(LocalTime localTime) {
        return (LocalTime.of(12, 0).toSecondOfDay() - localTime.toSecondOfDay()) / 3600.0;
    }
}