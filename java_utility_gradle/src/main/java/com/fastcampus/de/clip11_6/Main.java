package com.fastcampus.de.clip11_6;

public class Main {
    public static void main(String[] args) {
        Bird pigeon = new Pigeon();
        Bird peacock = new Peacock();

        System.out.println("--비둘기--");
        pigeon.fly(1, 2, 30000);
        System.out.println("--공작새--");
        peacock.fly(1, 2, 3);
    }
}
