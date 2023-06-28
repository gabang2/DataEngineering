package com.fastcampus.de.clip11_6;

abstract public class Bird {
    private int x, y, z;
    void fly(int x, int y, int z) {
        System.out.println("이동합니다.");
        this.x = x;
        this.y = y;

        if (flyable(z)) {
            this.z = z;
        } else {
            System.out.println("이 높이로는 날 수 없습니다.");
        }
        this.printLocation();
    }

    public void printLocation() {
        System.out.println("Location: " + x+"/"+y+"/"+z);
    }

    abstract boolean flyable(int z);

}
