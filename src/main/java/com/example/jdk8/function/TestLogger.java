package com.example.jdk8.function;

public class TestLogger {
    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.debug(() -> "Look at this");
    }
}
