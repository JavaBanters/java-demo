package dates;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ComparingTimesDurationExample {

    public static void main(String[] args) {
        LocalTime localTime = LocalTime.of(7, 20);
        LocalTime localTime1 = LocalTime.of(8,10);

        long minutes = localTime.until(localTime1, ChronoUnit.MINUTES);
        System.out.println(minutes);

        Duration duration = Duration.between(localTime, localTime1);
        System.out.println(duration.getSeconds());
        System.out.println(duration.getNano());
        System.out.println(duration.toMinutes());

        Duration duration1 = Duration.ofHours(3);
        System.out.println(duration1.toMinutes());

        Duration duration2 = Duration.ofMinutes(5);
        System.out.println(duration2.toMinutes());

        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = LocalDate.now().plus(1, ChronoUnit.DAYS);
        Duration duration3 = Duration.between(localDate, localDate1);
        System.out.println(duration3.toDays()); // unsupported
    }

}
