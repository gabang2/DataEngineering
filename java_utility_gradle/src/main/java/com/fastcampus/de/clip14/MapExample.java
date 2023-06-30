package com.fastcampus.de.clip14;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "gayeong");
        map.put(2, "yunyeong");
        map.put(3, "hyesook");
        System.out.println(map);

        Map<String, String> map2 = new HashMap<>();
        map2.put("first", "gayeong");
        map2.put("second", "yunyeong");
        map2.putIfAbsent("second", "yunyeong2");
        map2.put("third", "hyesook");
        System.out.println(map2);

        if(map2.containsKey("first")) {
            System.out.println(map2.get("first"));
        } else if(!map2.containsKey("no exists")) {
            System.out.println("doesn't exist");
        }

        System.out.println();
        for (String key:map2.keySet()) {
            System.out.println(map2.get(key));
        }

        System.out.println(map2.keySet());
        map2.remove("first");
        System.out.println(map2);

        map2.clear();
        System.out.println(map2);
    }
}
