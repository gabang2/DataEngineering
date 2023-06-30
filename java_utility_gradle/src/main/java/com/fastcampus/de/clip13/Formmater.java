package com.fastcampus.de.clip13;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Formmater {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2022, Month.JUNE, 30, 13, 33);
        System.out.println(localDateTime.format(DateTimeFormatter.ISO_DATE));
        System.out.println(localDateTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM).withLocale(Locale.KOREA)));
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("yyyy년이고, MM월 dd일이야!")));
    }
}
