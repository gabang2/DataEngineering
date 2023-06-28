package com.fastcampus.de.clip12;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatchStatement {
    public static void main(String[] args) {
        int number = 10;
        for (int i = 10; i >= 0; i--) {
            try {
                int result = number / i;
                System.out.println(result);
            } catch (Exception e) {
                System.out.println("Exception 발생: " + e.getMessage());
            } finally {
                System.out.println("항상 실행되는 finally구문");
            }
        }
    }
}
