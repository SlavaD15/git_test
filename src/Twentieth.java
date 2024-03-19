import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Objects;

public class Twentieth {
    public static void main(String[] args) {
        //month_length_in_year(2000);
        //System.out.println(is_fridayThe13(13, 10, 2023));
        //how_old_am_I(24, 11, 2023);
        holidays();
    }
    public static void month_length_in_year(int year){
        for(int i = 1;i<=12;i++){
            YearMonth yearMonth = YearMonth.of(year, i);
            System.out.println(yearMonth.lengthOfMonth());
        }
    }

    public static boolean is_fridayThe13(int dayOfMonth, int month, int year){
        LocalDate date = LocalDate.of(year, month, dayOfMonth);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        return Objects.equals(dayOfWeek.toString(), "FRIDAY") && dayOfMonth == 13;
    }

    public static void how_old_am_I(int dayOfMonth, int month, int year){
        LocalDate date_given = LocalDate.of(year, month, dayOfMonth);
        LocalDate date_birthday = LocalDate.of(2007, 9, 15);
        int age_years = date_given.getYear()-date_birthday.getYear();
        int age_days = date_given.getDayOfYear()-date_birthday.getDayOfYear();
        System.out.println("I am " + age_years + " years and " + age_days + " days old");
        System.out.println(date_birthday.getDayOfWeek());
        System.out.println(date_birthday.getDayOfYear());
        System.out.println(date_birthday.getMonth());
        System.out.println(date_birthday.getYear());
    }

    public static void holidays(){
        System.out.printf("%s - %d %s\n", "\"Новый год\"", 31, "декабря");
        System.out.printf("%s - %d %s\n", "\"Пасха\"", 16, "апреля");
        System.out.printf("%s - %d %s\n", "\"Хэллоуин\"", 31, "октярбя");
    }
}
