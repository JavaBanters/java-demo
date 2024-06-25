package dates;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {

    public static void main(String[] args) {

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalTime localTime1 = LocalTime.of(4,30);
        System.out.println(localTime1);

        LocalTime localTime2 = LocalTime.of(4,30,07);
        System.out.println(localTime2);

        LocalTime localTime3 = LocalTime.of(22,30,07,23576);
        System.out.println(localTime3);

        /**
         * getting values from local time instance
         */

        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());
        System.out.println(localTime1.getNano());
        System.out.println(localTime.get(ChronoField.CLOCK_HOUR_OF_DAY));
        System.out.println(localTime.toSecondOfDay()); // represent time in seconds

        /**
         * modify values of local time
         */

        LocalTime localTime4 = localTime.minusHours(2);
        System.out.println(localTime4);

        System.out.println(localTime.minus(3, ChronoUnit.MINUTES));
        System.out.println(localTime.with(LocalTime.MIDNIGHT));
        System.out.println(localTime.with(ChronoField.HOUR_OF_DAY, 4));
        System.out.println(localTime.plus(3, ChronoUnit.MINUTES));
        System.out.println(localTime.withHour(10));

    }

}
