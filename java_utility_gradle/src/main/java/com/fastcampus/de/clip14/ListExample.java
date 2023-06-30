package com.fastcampus.de.clip14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(4);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
        System.out.println("size: " + list.size());
        list.remove(3);
        System.out.println(list);

        int[] intArr = new int[3];
        intArr[0] = 1;
        intArr[1] = 2;
        intArr[2] = 3;
        for (int i = 0; i < 5; i++) {
            System.out.println(intArr[i]);
        }
        for (int i : intArr) {
            System.out.println(i);
        }
    }
}
