package com.fastcampus.de.clip7;

public class Character {
    public static void main(String[] args) {
        char alphabet = 'A';
        System.out.println(alphabet);

        Defaults defaults = new Defaults();
        System.out.println(defaults.charDefault);
    }

    static class Defaults {
        char charDefault;

    }
}
