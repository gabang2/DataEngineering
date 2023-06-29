package com.fastcampus.de.clip12_Quiz2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        try {
            if(PathValidator.validate(path)) {
                System.out.println(path + "는 접근 가능한 경로입니다.");
            } else {
                System.out.println(path + "는 접근 불가능한 경로입니다.");
            }
        } catch (PathError pathError) {
            System.out.println(pathError.getMessage());
            pathError.printStackTrace();
            System.out.println("프로그램이 강제종료 됩니다.");
            System.exit(1);
        }
    }
}
