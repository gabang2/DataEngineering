package com.fastcampus.de.clip11_8_Lecture;

public class GrandParent extends Human implements Walkable {

    public GrandParent(String name, int age) {
        super(name, age, 1);
    }
    @Override
    public void walk(int x, int y) {
        this.printHuman();
        System.out.println(this.x + ", " + this.y + "좌표에서 걷기 시작합니다. - speed : " + speed);
        this.x = x;
        this.y = y;
        System.out.println(this.x + ", " + this.y + "좌표로 걸었습니다. - speed : " + speed);
    }


}
