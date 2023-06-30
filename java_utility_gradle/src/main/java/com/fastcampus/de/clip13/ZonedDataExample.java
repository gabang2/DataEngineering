package com.fastcampus.de.clip13;

import java.time.*;

public class ZonedDataExample {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("America/Cuiaba");
        System.out.println(zoneId);
        System.out.println(ZoneId.getAvailableZoneIds());

        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zoneId);
        System.out.println(zonedDateTime);
        System.out.println(ZonedDateTime.parse("2023-06-30T13:00:24.734-04:00[America/Cuiaba]"));

        ZoneOffset offset = ZoneOffset.of("+02:00");
        OffsetDateTime offsetDateTime = OffsetDateTime.of(localDateTime, offset);
        System.out.println(offsetDateTime);
    }
}
