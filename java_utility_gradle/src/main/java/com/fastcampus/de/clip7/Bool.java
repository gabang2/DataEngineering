package com.fastcampus.de.clip7;

public class Bool {
    // psvm을 쓰면 public static void main(String[] args)가 자동완성됨
    public static void main(String[] args) {
        boolean fact = true;
        System.out.println(fact);

        Defaults defaults = new Defaults();
        System.out.println(defaults.booleanDefault);
    }

    static class Defaults {
        boolean booleanDefault;
    }
}
