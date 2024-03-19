package Thirty_third;

import java.time.LocalDate;

public class DateDefiner {
    private DayOfWeek getDayOfWeek(int dayNumber){
        DayOfWeek[] days = DayOfWeek.values();
        for(DayOfWeek day : days){
            if(day.getDayNumber() == dayNumber){
                return day;
            }
        }
        return null;
    }

    private Month getMonth(int monthNumber){
        Month[] months = Month.values();
        for(Month month : months){
            if(month.getMonthNumber() == monthNumber){
                return month;
            }
        }
        return null;
    }

    public CurrentDate defineCurrentDate(){
        LocalDate current = LocalDate.now();
        int year = current.getYear();
        int monthNumber = current.getMonthValue();
        int dayOfMonth = current.getDayOfMonth();
        Month month = getMonth(monthNumber);
        var dayNumber = current.getDayOfWeek().getValue();
        DayOfWeek dayOfWeek = getDayOfWeek(dayNumber);
        return new CurrentDate(year, month, dayOfMonth, dayOfWeek);
    }

    public Season defineSeason(Month month){
        return switch (month) {
            case DECEMBER, JANUARY, FEBRUARY -> Season.WINTER;
            case MARCH, APRIL, MAY -> Season.SPRING;
            case JUNE, JULY, AUGUST -> Season.SUMMER;
            case SEPTEMBER, OCTOBER, NOVEMBER -> Season.AUTUMN;
        };
    }

    public static void main(String[] args) {
        DateDefiner definer = new DateDefiner();
        System.out.println(definer.defineCurrentDate().toString());
        System.out.println("----------------");
        System.out.println(definer.defineSeason(Month.FEBRUARY));
    }
}
