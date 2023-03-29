package com.example.java.time;

import java.time.LocalDate;

/**
 * @author lenovo
 */
public class TestLocalDate {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.toString());
    }
}
