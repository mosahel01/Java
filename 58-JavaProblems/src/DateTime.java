import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class DateTime {
    public static void main(String[] args) {


        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss aa");
        SimpleDateFormat timeFormat = new SimpleDateFormat("dd/MM/yyyy");

        // System.out.println(date);
        System.out.println("Date: " + dateFormat.format(date));
        System.out.println("Time: " + timeFormat.format(date));


        // Age calculator
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(2004, 3, 3);

        int years = Period.between(birthday, today).getYears();
        int months = Period.between(birthday, today).getMonths();
        int days = Period.between(birthday, today).getDays();

        System.out.printf("You are %dyears %dmonths %ddays old", years,months,days);

    }
}
