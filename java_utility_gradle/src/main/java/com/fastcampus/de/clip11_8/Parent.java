package com.fastcampus.de.clip11_8;

public class Parent extends Person {
    public Parent(String name, int age) {
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
        return false;
    }
}
