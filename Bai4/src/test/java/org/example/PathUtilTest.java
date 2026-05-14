package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PathUtilTest {

    @Test
    void testPath() {
        String path = PathUtil.getPath();

        assertTrue(path.contains("\\"));
    }
}