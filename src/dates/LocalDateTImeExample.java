package dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalDateTImeExample {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.of(LocalDate.ofYearDay(2003,146), LocalTime.now());
        System.out.println(localDateTime1);

        System.out.println(localDateTime.getHour());
        System.out.println(localDateTime.getMinute());
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getDayOfYear());
        System.out.println(localDateTime.get(ChronoField.ALIGNED_WEEK_OF_MONTH));

        /*
         * Modifying LocalDate time
         */

        System.out.println(localDateTime.plus(5, ChronoUnit.CENTURIES));
        System.out.println(localDateTime.plusHours(2));
        System.out.println(localDateTime.minusDays(5));
        System.out.println(localDateTime.withMonth(3));

        /*
         * COnvert localdata, localtime to localdatetime and vice versa
         */

        LocalDate localDate = LocalDate.of(2019, 01 , 01);
        System.out.println(localDate.atTime(21,45));

        LocalTime localTime = LocalTime.of(23,59);
        System.out.println(localTime.atDate(localDate));

        LocalDateTime localDateTime2 = localTime.atDate(localDate);
        System.out.println(localDateTime2.toLocalDate());
        System.out.println(localDateTime2.toLocalTime());
    }

}
