package com.fastcampus.de.clip7;

public class Numbers {
    public static void main(String[] args){
        short s = 1;
        System.out.println(s);

        int a = 3;
        System.out.println(a);

        long b = 1234567L;
        System.out.println(b);

        float c = 5.5F;
        System.out.println(c);

        double d = 9.12345678903456723456789034567234567890345672345678903456723456789034567234567890345672345678903456723456789034567234567890345672345678903456723456789034567d;
        System.out.println(d);

        //System.out.println 단축키 -> sout
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);

        System.out.println("********** default **********");
        Defaults defaults = new Defaults();
        System.out.println(defaults.shortDefault);
        System.out.println(defaults.intDefault);
        System.out.println(defaults.longDefault);
        System.out.println(defaults.floatDefault);
    }

    static class Defaults {
        short shortDefault;
        int intDefault;
        long longDefault;
        float floatDefault;
    }
}
