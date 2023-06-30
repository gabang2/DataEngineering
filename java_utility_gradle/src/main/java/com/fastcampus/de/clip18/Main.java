package com.fastcampus.de.clip18;

import retrofit2.Call;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        Call<Object> retrofitTest = RetrofitClient.getApi().retrofitTest(2);
        try {
            System.out.println(retrofitTest.execute().body());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
