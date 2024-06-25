package dates;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class ComparingDates {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2018, 01 ,01);
        LocalDate localDate1 = LocalDate.of(2019, 12, 31);

        Period period = localDate.until(localDate1);
        System.out.println(period.getDays());
        System.out.println(period.getMonths());
        System.out.println(period.getYears());

        Period period1 = Period.ofDays(10);
        System.out.println(period1.getDays());

        Period period2 = Period.ofYears(10);
        System.out.println(period2.getYears());
        System.out.println(period2.toTotalMonths());

        Period period3 = Period.between(localDate,localDate1);
        System.out.println(period3.getDays());
        System.out.println(period3.getYears());
        System.out.println(period3.getMonths());

    }

}
