package dates;

import java.time.LocalDate;
import java.time.temporal.*;

public class LocalDateExample {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate localDate1 = LocalDate.of(2024,06,13);
        System.out.println(localDate1);

        LocalDate localDate2 = LocalDate.ofYearDay(2024, 60);
        System.out.println(localDate2);

//        System.out.println(localDate2.getMonth());
//        System.out.println(localDate2.getMonthValue());
//        System.out.println(localDate1.getDayOfWeek());
//        System.out.println(localDate2.getDayOfYear());
//        System.out.println(localDate2.get(ChronoField.DAY_OF_MONTH));


        System.out.println(localDate.plusDays(2));
        System.out.println(localDate.plusMonths(1).plusDays(3));
        System.out.println(localDate.minusDays(2));
        System.out.println(localDate.minusMonths(2).plusDays(1));
        System.out.println(localDate.withYear(2001));
        System.out.println(localDate.with(ChronoField.YEAR, 2020));
        System.out.println(localDate.with(TemporalAdjusters.firstDayOfMonth()));
        System.out.println(localDate.minus(1, ChronoUnit.DECADES));

        System.out.println(localDate.isLeapYear());
        System.out.println(localDate.isEqual(localDate1));
        System.out.println(localDate.isBefore(localDate1));
        System.out.println(localDate.isAfter(localDate1));

        //System.out.println(localDate.minus(1, ChronoUnit.MINUTES).isSupported(ChronoUnit.MINUTES)); // unsupported

        System.out.println(localDate.isSupported(ChronoUnit.MINUTES));
    }

}
