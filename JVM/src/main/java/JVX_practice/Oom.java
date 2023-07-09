package JVX_practice;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;

public class Oom {
    public static void main(String[] args) throws InterruptedException {
        List<String> list = new ArrayList<>();
        while(true) {
            new Object(); // 객체를 많이 만들어야 Minor GC가 일어나니까 마구 생성해주자!
            String str = RandomStringUtils.random(10);
            list.add(str);
            if(str.contains("a")){
                Thread.sleep(500);
            }
        }
    }
}