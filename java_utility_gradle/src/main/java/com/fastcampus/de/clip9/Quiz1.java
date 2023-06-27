package com.fastcampus.de.clip9;

import java.util.Scanner;

public class Quiz1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if (score >90) {
            System.out.println("A등급");
        } else if (score > 80) {
            System.out.println("B등급");
        } else if (score > 70) {
            System.out.println("C등급");
        } else {
            System.out.println("F등급");
        }
    }
}
