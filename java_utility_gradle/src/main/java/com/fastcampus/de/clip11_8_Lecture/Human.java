package com.fastcampus.de.clip11_8_Lecture;

public class Human {
    String name;
    int age;
    int x;
    int y;
    int speed;

    public Human(String name, int age, int x, int y, int speed) {
        this.name = name;
        this.age = age;
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public Human(String name, int age, int speed) {
        this(name, age, 0, 0, speed);
    }

    public void printHuman() {
        System.out.println("=====-----======");
        System.out.println("이름: " + name + " 나이: " + age + " 좌표: (" + x + ", " + y + ") 속도: " + speed);
    }
}
