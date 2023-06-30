package com.fastcampus.de.clip18;

import retrofit2.Call;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Call<Object> retrofitTest = RetrofitClient.getApi().retrofitTest(2);//우리는 2페이지를 확인할 것이기 때문에 2를 삽입하겠습니다.
        //Call은 retrofit라이브러리의 인터페이스이며 서버에서 응답하는 값을 담는 역할을 합니다.
        try {
            System.out.println(retrofitTest.execute().body());//서버에서 받은 데이터를 확인해보겠습니다.
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
