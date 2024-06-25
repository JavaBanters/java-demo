package dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingLocalDateExample {

    public static void parseLocalDate() {
        String date = "2018-04-28";
        //LocalDate localDate = LocalDate.parse(date);
        LocalDate localDate = LocalDate.parse(date, DateTimeFormatter.ISO_DATE);
        System.out.println(localDate);

        String date1 = "20180428";
        LocalDate localDate1 = LocalDate.parse(date1, DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(localDate1);

        //Custom defined
        String date3 = "2018|04|29";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
        LocalDate localDate2 = LocalDate.parse(date3,dateTimeFormatter);
        System.out.println(localDate2);

        String date4 = "2018*04-29";
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy*MM-dd");
        LocalDate localDate3 = LocalDate.parse(date4,dateTimeFormatter1);
        System.out.println(localDate3);


    }

    public static void formatLocalDate() {
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(localDate.format(dateTimeFormatter));
    }
    public static void main(String[] args) {
       // parseLocalDate();
        formatLocalDate();
    }
}
