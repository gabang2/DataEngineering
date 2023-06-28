package com.fastcampus.de.clip11_8_Lecture;

public class Main {
    public static void main(String[] args) {
        Human child = new Child("자식", 15);
        Human parent = new Parent("엄마",45);
        Human grandParent = new GrandParent("할머니", 80);

        Human[] family = {child, parent, grandParent};
        for(Human human:family) {
            if (human instanceof Walkable) {
                ((Walkable) human).walk(1, 1);
            } if (human instanceof Runnable) {
                ((Runnable) human).run(2, 2);
            }if (human instanceof Swimmable) {
                ((Swimmable) human).swim(3, -1);
            }
        }
    }
}
