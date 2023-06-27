package com.fastcampus.de.clip8;

public class Logical {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // and
        System.out.println(a && b);
        // or(앞에것이 false면 뒤에는 확인하지도 않음)
        System.out.println(a || b);

        System.out.println((1 > 2) || (3 > 2));
    }
}
