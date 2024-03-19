package Thirty_third;

public enum DayOfWeek {
    SUNDAY("Sunday",7),
    MONDAY("Monday",1),
    TUESDAY("Tuesday",2),
    WEDNESDAY("Wednesday",3),
    THURSDAY("Thursday",4),
    FRIDAY("Friday",5),
    SATURDAY("Saturday",6);

    private String name;
    private int dayNumber;

    DayOfWeek(String name, int dayNumber) {
        this.name = name;
        this.dayNumber = dayNumber;
    }

    public String getName() {
        return name;
    }

    public int getDayNumber() {
        return dayNumber;
    }
}
