package com.fastcampus.de.clip11_8;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person child = new Child("miguel", 15);
        Person parent = new Parent("mama", 45);
        Person grandParent = new GrandParent("coco", 90);

        Person[] family = {child, parent, grandParent};
        for(Person person: family) {
            person.printStatus();
            person.walk();
            person.run();
            person.swim();
        }
    }
}
