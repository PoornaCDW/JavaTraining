package TravelProbelm;

import java.time.LocalDate;

interface HolidayStrategy {
    boolean isHoliday(LocalDate date);
}