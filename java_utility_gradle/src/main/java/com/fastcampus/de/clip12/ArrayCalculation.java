package com.fastcampus.de.clip12;

public class ArrayCalculation {

    int[] arr = {0, 1, 2, 3, 4};
    public int divide(int denominatorIndex, int numeratorIndex) throws ArithmeticException, ArrayIndexOutOfBoundsException{
        return arr[denominatorIndex] / arr[numeratorIndex];
    }

}
