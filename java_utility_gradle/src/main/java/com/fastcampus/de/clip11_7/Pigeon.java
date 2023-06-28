package com.fastcampus.de.clip11_7;

public class Pigeon implements Bird, Pet {
    private int x, y, z;

    @Override
    public void fly(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        System.out.println("Pigeon is flying");
    }

    @Override
    public String getBreed() {
        return "Happy Bird";
    }

    public void printLocation() {
        System.out.println("Current Location : " + x + "/" + y + "/" + z);
    }

    @Override
    public String getHome() {
        return "gabang2 house";
    }
}
