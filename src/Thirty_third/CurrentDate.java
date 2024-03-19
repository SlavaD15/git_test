package Thirty_third;

import java.time.LocalDate;

public class CurrentDate {
    private int year;
    private Month month;
    private int dayOfMonth;
    private DayOfWeek dayOfWeek;

    public CurrentDate(int year, Month month, int dayOfMonth, DayOfWeek dayOfWeek) {
        this.year = year;
        this.month = month;
        this.dayOfMonth = dayOfMonth;
        this.dayOfWeek = dayOfWeek;
    }

    @Override
    public String toString() {
        return String.format("Today is %s, %s %s %s", dayOfWeek.getName(), dayOfMonth, month, year);
    }
}
