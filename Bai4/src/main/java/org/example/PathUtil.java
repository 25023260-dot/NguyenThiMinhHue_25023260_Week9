package org.example;

import java.nio.file.Path;

public class PathUtil {

    public static String getPath() {
        return Path.of("data", "file.txt").toString();
    }
}