package dates;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingLocalDateTImeExample {

    public static void parseLocalDateTime() {
        String dateTime = "2024-04-19T15:23:45";
        LocalDateTime localDateTime = LocalDateTime.parse(dateTime);
        System.out.println(localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.parse(dateTime, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println(localDateTime1);

        String dateTime1 = "2024/04/19T15-23-45";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd'T'HH-mm-ss");
        LocalDateTime localDateTime2 = LocalDateTime.parse(dateTime1, dateTimeFormatter);
        System.out.println(localDateTime2);

        String dateTime2 = "2024/04/19abc15-23-45";
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy/MM/dd'abc'HH-mm-ss");
        LocalDateTime localDateTime3 = LocalDateTime.parse(dateTime2, dateTimeFormatter1);
        System.out.println(localDateTime3);

    }

    public static void formatLocalDateTime() {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd'T'HH-mm-ss");
        System.out.println(localDateTime.format(dateTimeFormatter));
    }
    public static void main(String[] args) {
        parseLocalDateTime();
        formatLocalDateTime();
    }

}
