package com.fastcampus.de.clip14;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack);
        System.out.println("last Element: " + stack.peek()); // 확인만 하는 용도
        System.out.println("size: " + stack.size());
        System.out.println("last Element: " + stack.pop()); // 실제로 제거
        System.out.println("size: " + stack.size());
        System.out.println("last Element: " + stack.peek());
        System.out.println("exist 1: " + stack.contains(1));
        System.out.println("exist 2: " + stack.contains(2));

        int lastSizeOfStack = stack.size();
        System.out.println(lastSizeOfStack);
        for (int i = 0; i < lastSizeOfStack; i++) {
            stack.pop();
        }
        System.out.println("is Empty: " + stack.isEmpty());
        System.out.println();
        // stack.pop();
    }
}
