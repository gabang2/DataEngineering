package com.fastcampus.de.clip11_8;

public class Child extends Person{
    public Child(String name, int age) {
        super(name, age);
    }

    @Override
    boolean availableWalk() {
        return true;
    }

    @Override
    boolean availableRun() {
        return true;
    }

    @Override
    boolean availableSwim() {
        return true;
    }
}
