package com.fastcampus.de.clip7;

public class Byte {
    public static void main(String[] args) {
        byte b = 'd';
        System.out.println(b);

        Defaults defaults = new Defaults();
        System.out.println(defaults.defaultByte);
    }

    static class Defaults {
        byte defaultByte;
    }
}
