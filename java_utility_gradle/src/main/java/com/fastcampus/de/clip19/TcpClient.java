package com.fastcampus.de.clip19;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.time.LocalTime;

public class TcpClient {
    public static void main(String[] args) {
        try {
            String serverIp = "localhost";
            System.out.println("[" + LocalTime.now() + "]" + "서버에 연결합니다.");
            System.out.println("[" + LocalTime.now() + "]" + "서버 IP: " + serverIp);
            Socket socket = new Socket(serverIp, 8888);

            OutputStream outputStream = socket.getOutputStream();
            outputStream.write("Hello\n".getBytes(StandardCharsets.UTF_8));
            outputStream.flush(); //flush는 보내는 것!

            InputStream inputStream = socket.getInputStream();
            DataInputStream dataInputStream = new DataInputStream(inputStream);

            System.out.println("[" + LocalTime.now() + "]" + "message from server: " + dataInputStream.readUTF());
            dataInputStream.close();
            socket.close();
            System.out.println("[" + LocalTime.now() + "]" + "연결이 종료되었습니다.");

        } catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
            e.printStackTrace();
        }


    }
}
