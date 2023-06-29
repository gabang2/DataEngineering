package com.fastcampus.de.clip12;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class tryWithResourceStatement {
    public static void main(String[] args) throws IOException {
        try (FileOutputStream out = new FileOutputStream("test.txt")) {
            out.write("Hello World".getBytes(StandardCharsets.UTF_8));
            out.flush();
        } catch(IOException e) {
            e.printStackTrace();
        } // resource가 auto close되는 객체이면 out.close를 하지 않아도 된다.
    }
}
