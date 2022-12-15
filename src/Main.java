import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDateTime time = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yy  HH mm");

        System.out.println(time.format(formatter));

        System.out.println(ZonedDateTime.now());


    //DayNumber FullMonthName Last2DigitsOfYearNumber HourTime MinuteTime
    }
}