package com.fastcampus.de.clip12_Quiz2;

import java.io.File;

public class PathValidator {
    public static boolean validate(String path) throws PathError{
        if (path.startsWith("/Users")) {
            File file = new File(path);
            return file.exists();
        } else {
            throw new PathError(path);
        }
    }
}
