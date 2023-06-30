package com.fastcampus.de.clip14;

import java.util.ArrayDeque;

public class ArrayDequeueExample {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addFirst(1);
        System.out.println(arrayDeque);
        arrayDeque.addFirst(2);
        System.out.println(arrayDeque);
        arrayDeque.addFirst(3);
        System.out.println(arrayDeque);

        arrayDeque.addLast(100);
        System.out.println(arrayDeque);

        arrayDeque.offerFirst(11);
        System.out.println(arrayDeque);
        arrayDeque.offerFirst(22);
        System.out.println(arrayDeque);

        arrayDeque.push(33);
        System.out.println(arrayDeque);
        arrayDeque.pop();
        System.out.println(arrayDeque);
        arrayDeque.poll();
        System.out.println(arrayDeque);
        arrayDeque.pollLast();
        System.out.println(arrayDeque);
        arrayDeque.removeFirst();
        System.out.println(arrayDeque);
    }
}
