package com.fastcampus.de.clip13;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());
        System.out.println(LocalDateTime.of(2022, Month.APRIL, 20, 18, 30));
        System.out.println(LocalDateTime.parse("2023-06-30T12:53:38.704"));

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.plusDays(1));
        System.out.println(now.minusHours(5));
        System.out.println(now.plusMonths(1));
    }
}
