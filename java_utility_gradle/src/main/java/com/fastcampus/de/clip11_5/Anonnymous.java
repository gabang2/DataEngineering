package com.fastcampus.de.clip11_5;

import java.lang.reflect.AnnotatedArrayType;

public class Anonnymous {
    public void call() {
        AccessModifierTest accessModifierTest = new AccessModifierTest();
        accessModifierTest.messageDefault();
        accessModifierTest.messageProtected();
        accessModifierTest.messagePublic();
    }

    public static void main(String[] args) {
        Anonnymous annonymous = new Anonnymous();
        annonymous.call();
    }
}
