package com.fastcampus.de.clip11_1;

public class CalculationTest {
    static class Calculation {
        int extra = 1;
        static int add(int x, int y) {
            int result = x + y; // 지역변수
            return result;
        }

        int substract(int x, int y) {
            return x - y;
        }
    }

    public static void main(String[] args) {
        Calculation calculation = new Calculation();
        System.out.println(Calculation.add(100, 5));
        System.out.println(calculation.add(3, 1));
        System.out.println(calculation.substract(3, 1));
    }
}
