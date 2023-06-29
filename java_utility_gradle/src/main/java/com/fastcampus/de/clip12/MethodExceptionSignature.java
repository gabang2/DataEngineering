package com.fastcampus.de.clip12;

public class MethodExceptionSignature {
    static void methodThrowsException() throws Exception {

    }

    static void methodThrowsRuntimeException() throws RuntimeException {

    }

    public static void main(String[] args) {
        methodThrowsRuntimeException();
        try {
            methodThrowsException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
