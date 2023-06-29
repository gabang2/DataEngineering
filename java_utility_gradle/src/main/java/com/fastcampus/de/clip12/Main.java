package com.fastcampus.de.clip12;

import com.fastcampus.de.clip7.Array;

public class Main {
    public static void main(String[] args) {
        ArrayCalculation arrayCalculation = new ArrayCalculation();
        /*****----정상 출력-----*****/
        try {
            System.out.println("2 / 1 = " + arrayCalculation.divide(2, 1));
        } catch (ArithmeticException e) {
            System.out.println("잘못된 계산임");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("현재 배열의 크기는 " + arrayCalculation.arr.length + "입니다.");
        }

        /*****----ArithmeticException발생-----*****/
        try {
            System.out.println("1 / 0 = " + arrayCalculation.divide(1, 0));
        } catch (ArithmeticException e) {
            System.out.println("잘못된 계산임");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("현재 배열의 크기는 " + arrayCalculation.arr.length + "입니다.");
        }

        /*****----ArrayIndexOutOfBoundsException발생-----*****/
        try {
            System.out.println("Try to divide using out of index element = " + arrayCalculation.divide(5, 0));
        } catch (ArithmeticException e) {
            System.out.println("잘못된 계산임");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("현재 배열의 크기는 " + arrayCalculation.arr.length + "입니다.");
        }
    }
}
