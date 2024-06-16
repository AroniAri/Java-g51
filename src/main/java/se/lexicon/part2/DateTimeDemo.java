import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {
    public static class DateTimeDemo {


        public static void main(String[] args) {

            LocalDate currentDate = LocalDate.now();
            System.out.println("Today: " + currentDate);


        }
    }

    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("2024 06 16");
        System.out.println(formatter);

    }
}


public static void main(String[] args) {
    LocalDate myBirthDate = LocalDate.parse("1945-06-11");
    LocalDate today = LocalDate.parse("2024-06-16");

    Period period = Period.between(myBirthDate, today);
    int years = period.getYears();
    int months = period.getMonths();
    int days = period.getDays();
    System.out.println(years + "years", + months + "months ," + days + " days.");




}


















