package com.fastcampus.de.clip11_5_1;

import com.fastcampus.de.clip11_5.AccessModifierTest;

public class Anonnymous extends AccessModifierTest{
    public void call() {
/*        this.messageInside();
        this.messageDefault();*/
        this.messageProtected();
        this.messagePublic();
    }

    public static void main(String[] args) {
        Anonnymous annonymous = new Anonnymous();
        annonymous.call();
    }
}
