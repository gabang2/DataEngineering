package com.fastcampus.de.clip11_8;

abstract public class Person {
    String name;
    int age;
    int x, y;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.x = 0;
        this.y = 0;
    }

    public void printStatus() {
        System.out.println("이름: " + name + " 나이: " + age + " 현재 위치: " + "좌표(" + x + ", " + y + ")");
    }

    public void walk() {
        if (this.availableWalk()) {
            x++;
            y++;
            System.out.println(name + "이 걸어서, 좌표(" + x + ", " + y + ")로 이동했습니다.");
        }
    }

    public void run() {
        if (this.availableRun()) {
            x += 2;
            y += 2;
            System.out.println(name + "이 뛰어서, 좌표(" + x + ", " + y + ")로 이동했습니다.");
        }
    }

    public void swim() {
        if (this.availableSwim()) {
            x += 3;
            y -= 1;
            System.out.println(name + "이 수영해서, 좌표(" + x + ", " + y + ")로 이동했습니다.");
        }
    }

    abstract boolean availableWalk();
    abstract boolean availableRun();
    abstract boolean availableSwim();
}
