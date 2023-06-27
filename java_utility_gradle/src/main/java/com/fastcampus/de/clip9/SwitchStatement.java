package com.fastcampus.de.clip9;

public class SwitchStatement {
    enum Score {
        A, B, C, D, E
    }
    public static void main(String[] args) {

        System.out.println("***** enum *****");
        Score input = Score.B;
        switch (input){
            case A:
                System.out.println("Score: 4.0");
                break;
            case B:
                System.out.println("Score: 3.0");
                break;
            case C:
                System.out.println("Score: 2.0");
                break;
            case D:
                System.out.println("Score: 1.0");
                break;
            case E:
                System.out.println("Score: 0.0");
                break;
        }
        System.out.println("***** normal *****");
        char score = 'A';
        switch (score){
            case 'A':
                System.out.println("Score: 4.0");
                break;
            case 'B':
                System.out.println("Score: 3.0");
                break;
            case 'C':
                System.out.println("Score: 2.0");
                break;
            default:
                System.out.println("out of score");
                break;
        }
    }
}
