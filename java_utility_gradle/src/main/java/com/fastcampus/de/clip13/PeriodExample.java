package com.fastcampus.de.clip13;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodExample {
    public static void main(String[] args) {
        LocalDate initialDate = LocalDate.of(2022, 7, 10);
        LocalDate finalDate = initialDate.plus(Period.ofDays(5));
        System.out.println(finalDate);
        System.out.println(Period.between(initialDate, finalDate).getMonths());
        System.out.println(ChronoUnit.DAYS.between(initialDate, finalDate));
    }
}
