package TravelProbelm;

import java.time.*;
import java.util.ArrayList;
import java.util.List;

class DefaultHolidayStrategy implements HolidayStrategy {
    private List<LocalDate> holidays;

    public DefaultHolidayStrategy() {
        this.holidays = new ArrayList<>();
        holidays.add(LocalDate.of(Year.now().getValue(), Month.JANUARY, 1)); // Jan 1
        holidays.add(LocalDate.of(Year.now().getValue(), Month.AUGUST, 15)); // Aug 15
        holidays.add(LocalDate.of(Year.now().getValue(), Month.JANUARY, 26)); // Jan 26
    }

    @Override
    public boolean isHoliday(LocalDate date) {
        return holidays.contains(date);
    }
}