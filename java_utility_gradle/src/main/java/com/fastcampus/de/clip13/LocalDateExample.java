package com.fastcampus.de.clip13;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(LocalDate.of(2023, 6, 20));
        System.out.println(localDate.parse("2022-02-20"));

        LocalDate tomorrow = LocalDate.now().plusDays(1);
        System.out.println(tomorrow);
        LocalDate yesterday = LocalDate.now().minusMonths(1);
        System.out.println(yesterday);
        DayOfWeek friday = LocalDate.now().getDayOfWeek();
        System.out.println(friday);

        int twelve = LocalDate.parse("2023-06-20").getDayOfMonth();
        System.out.println(twelve);
        System.out.println(LocalDate.now().isLeapYear());
        System.out.println(LocalDate.parse("2024-01-01").isLeapYear());
        System.out.println(LocalDate.parse("2023-06-20").isBefore(LocalDate.parse("2023-06-30")));

        LocalDateTime begginingOfDay = LocalDate.now().atStartOfDay();
        System.out.println(begginingOfDay);
        LocalDate firstDayOfMonth = LocalDate.parse("2023-06-30").with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(firstDayOfMonth);
    }
}
