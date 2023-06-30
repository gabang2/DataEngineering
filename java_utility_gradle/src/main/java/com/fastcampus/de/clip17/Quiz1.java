package com.fastcampus.de.clip17;

import java.util.Arrays;
import java.util.List;

public class Quiz1 {
    public static void main(String[] args) {
        String[] arr = {"김정우", "김호정", "이하늘", "이정희", "박정우", "박지현", "정우석", "이지수"};
        List<String> strArr = Arrays.asList(arr);
        long count = strArr.stream()
                .filter((str) -> str.startsWith("이")).count();
        System.out.println("count : " + count);
    }
}
