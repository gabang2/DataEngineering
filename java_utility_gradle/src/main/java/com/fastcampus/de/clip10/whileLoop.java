package com.fastcampus.de.clip10;

public class whileLoop {
    public static void main(String[] args) {
        int i = 0;
        while(i<100) {
            i++;
            if(i==5){
                continue;
            }
            if(i==10){
                break;
            }
            System.out.println(i);
        }
    }
}
