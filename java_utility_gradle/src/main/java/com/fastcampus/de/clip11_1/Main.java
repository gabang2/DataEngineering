package com.fastcampus.de.clip11_1;

public class Main {
    static class Person {
        String name;
        String country;
        int age;
        Person(String name, String country, int age) {
            this.name = name;
            this.country = country;
            this.age = age;
            if(country.equals("Denmark")){
                this.age -= 1;
            }
        }
        Person(){}
    }

    public static void main(String[] args) {
        Person minsoo = new Person();
        minsoo.name = "minsoo";
        minsoo.country = "South Korea";
        minsoo.age = 10;

        Person paul = new Person("Paul", "Denmark", 25);

        Person[] persons = {minsoo, paul};
        for (Person person : persons) {
            System.out.println("<자기소개>");
            System.out.println("Hello. My name is " + person.name);
            System.out.println("I am from " + person.country);
            System.out.println("I am " + person.age + " years old");

        }
    }
}
