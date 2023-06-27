package com.fastcampus.de.clip10;

public class doWhileLoop {
    public static void main(String[] args) {
        int i = 1;
        int result = 0;
        do {
            result += i;
            i += 1;
        } while (i < 5);
        System.out.println(result);
    }
}
