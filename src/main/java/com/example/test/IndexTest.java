package com.example.test;

public class IndexTest {
    public static void main(String[] args) {
        int c = "ABCDEFGH".indexOf("C");
        System.out.println(c);

        String a = "a-";
        String[] split = a.split("-");
        System.out.println(split.length);
    }
}
