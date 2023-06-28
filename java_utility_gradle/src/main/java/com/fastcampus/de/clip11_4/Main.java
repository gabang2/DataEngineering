package com.fastcampus.de.clip11_4;

public class Main {
    static class Animal {
        String name;
        Animal(String name) {
            this.name = name;
        }

        public void cry() {
            System.out.println(name + " is crying");
        }
    }

    static class Giraffe extends Animal {

        Giraffe(String name) {
            super(name);
        }
        @Override   //캡슐화를 깨는 느낌...이라고?? 한다
        public void cry() {
            System.out.println("cannot cry");
        }
    }

    static class Dog extends Animal {
        String breed;
        Dog(String name,String breed) {
            super(name);
            this.breed = breed;
        }

        public void bark() {
            System.out.println(name + "(" + breed + ") is barking");
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog("coco", "허스키");
        dog.cry();
        dog.bark();

        Animal animal = dog;
        animal.cry();

        Animal giraffe = new Giraffe("gigigi");
        giraffe.cry();
    }
}
