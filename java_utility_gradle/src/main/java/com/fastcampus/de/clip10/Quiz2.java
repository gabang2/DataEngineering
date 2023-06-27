package com.fastcampus.de.clip10;

public class Quiz2 {
    public static void main(String[] args) {
        int sumEven = 0;  // 짝수
        int sumOdd = 0;  // 홀수
        int i = 0;
        while (i < 30) {
            i++;
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }
        System.out.println("짝수 : " + sumEven);
        System.out.println("홀수 : " + sumOdd);
    }
}
