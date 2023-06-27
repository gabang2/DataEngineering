package com.fastcampus.de.clip9;

public class IfStatement {
    public static void main(String[] args) {
        int check = 100;
        int num1 = 150;

        if (num1 > check) {
            System.out.println("100 보다 크다");
        } else if (num1 == check){
            System.out.println("100이다");
        } else {
            System.out.println("100보다 작다");
        }
    }
}
