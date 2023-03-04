package TravelProbelm;

import java.time.*;

class LeapYearHolidayStrategy extends DefaultHolidayStrategy {
    private final int TWENTYNINE;

    public LeapYearHolidayStrategy() {
        TWENTYNINE = 29;
    }

    @Override
    public boolean isHoliday(LocalDate date) {
        // Check if it is one of the holidays or Feb 29
        return super.isHoliday(date) || (date.getMonth() == Month.FEBRUARY && date.getDayOfMonth() == TWENTYNINE);
    }
}