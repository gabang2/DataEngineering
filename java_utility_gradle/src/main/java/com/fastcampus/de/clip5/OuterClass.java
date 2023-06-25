package com.fastcampus.de.clip5;

public class OuterClass {
    public static void main(String[] args) {
        System.out.println("Java 5강");
        InnerClass innerClass = new InnerClass();
        innerClass.printName();
    }

    public static class InnerClass {
        public void printName(){
            System.out.printlcn(this.getClass().getName());
            System.out.println(this.getClass().getSimpleName());
        }
    }

}
