package dates;

import java.time.*;

public class ZonedDateTimeExample {

    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        System.out.println(zonedDateTime.getOffset());

        System.out.println(zonedDateTime.getZone());

//        ZoneId.getAvailableZoneIds()
//                .stream().forEach(zone-> System.out.println(zone));

        System.out.println(ZoneId.getAvailableZoneIds().size());

        System.out.println(ZonedDateTime.now(ZoneId.of("America/Chicago")));
        System.out.println(ZonedDateTime.now(ZoneId.of("America/Detroit")));
        System.out.println(ZonedDateTime.now(ZoneId.of("America/Los_Angeles")));
        System.out.println(ZonedDateTime.now(ZoneId.of("America/Denver")));
        System.out.println(ZonedDateTime.now(Clock.system(ZoneId.of("America/Chicago"))));

        System.out.println(LocalDateTime.now(ZoneId.of("America/Detroit")));
        System.out.println(LocalDateTime.now(Clock.system(ZoneId.of("America/Detroit"))));

        System.out.println(LocalDateTime.ofInstant(Instant.now(), ZoneId.of("America/Chicago")));

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        System.out.println(localDateTime.atZone(ZoneId.of("America/Chicago")));

        System.out.println(Instant.now().atZone(ZoneId.of("America/Detroit")));

        System.out.println(localDateTime.atOffset(ZoneOffset.ofHours(-6)));
    }
}
