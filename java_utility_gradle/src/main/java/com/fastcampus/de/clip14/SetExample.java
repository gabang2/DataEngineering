package com.fastcampus.de.clip14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(1);
        integerSet.add(3);
        integerSet.add(2);
        integerSet.add(4);
        integerSet.add(2); // 중복된 값 한 개만 저장됨
        System.out.println(integerSet);

        Set<String> stringSet = new HashSet<>();
        stringSet.add("Busan");
        stringSet.add("Seoul");
        stringSet.add("YangYang");
        stringSet.add("Daegu");
        stringSet.remove("Seoul");
        System.out.println(stringSet);

        System.out.println("exist LA? : " + stringSet.contains("LA"));

        Set<String> removeTarget = new HashSet<>();
        removeTarget.add("YangYang");
        removeTarget.add("Busan");
        stringSet.removeAll(removeTarget);
        System.out.println(stringSet);
        System.out.println(stringSet.size());
        stringSet.clear();
        System.out.println(stringSet);
    }
}
