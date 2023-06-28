package com.fastcampus.de.clip11_8;

public class GrandParent extends Person {
    public GrandParent(String name, int age) {
        super(name, age);
    }

    @Override
    boolean availableWalk() {
        return true;
    }

    @Override
    boolean availableRun() {
        return false;
    }

    @Override
    boolean availableSwim() {
        return false;
    }
}
