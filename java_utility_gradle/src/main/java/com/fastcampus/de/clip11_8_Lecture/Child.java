package com.fastcampus.de.clip11_8_Lecture;

public class Child extends Human implements Walkable, Runnable, Swimmable {

    public Child(String name, int age) {
        super(name, age,5);
    }

    @Override
    public void walk(int x, int y) {
        this.printHuman();
        System.out.println(this.x+", " + this.y + "좌표에서 걷기 시작합니다. - speed : " + speed);
        this.x = x;
        this.y = y;
        System.out.println(this.x+", " + this.y + "좌표로 걸었습니다. - speed : " + speed);
    }

    @Override
    public void run(int x, int y) {
        this.printHuman();
        System.out.println(this.x+", " + this.y + "좌표에서 뛰기 시작합니다. - speed : " + speed);
        this.x = x;
        this.y = y;
        System.out.println(this.x+", " + this.y + "좌표로 뛰었습니다. - speed : " + (speed+2));
    }

    @Override
    public void swim(int x, int y) {
        this.printHuman();
        System.out.println(this.x+", " + this.y + "좌표에서 수영하기 시작합니다. - speed : " + speed);
        this.x = x;
        this.y = y;
        System.out.println(this.x+", " + this.y + "좌표로 수영했습니다. - speed : " + (speed+1));
    }


}
