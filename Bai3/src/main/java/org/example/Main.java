package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static int add(int a, int b) {
        logger.info("Adding {} + {}", a, b);
        return a + b;
    }

    public static void main(String[] args) {
        logger.info("Application started");
        System.out.println("Result: " + add(2, 3));
        logger.info("Application finished");
    }
}