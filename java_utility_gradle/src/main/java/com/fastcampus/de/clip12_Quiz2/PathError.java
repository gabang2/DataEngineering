package com.fastcampus.de.clip12_Quiz2;

public class PathError extends Error{
    String path;

    public PathError(String path) {
        super();
        this.path = path;
    }
    @Override
    public String getMessage(){
        return path + " 는 접근 불가능한 경로입니다.";
    }
}
