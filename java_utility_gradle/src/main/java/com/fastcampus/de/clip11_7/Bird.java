package com.fastcampus.de.clip11_7;

public interface Bird {
    String STATIC_VARIABLE = "STATIC";
    void fly(int x, int y, int z);
    default void printBreed(){
        System.out.println("I am a kind of " + getBreed());
    }
    String getBreed();
}
