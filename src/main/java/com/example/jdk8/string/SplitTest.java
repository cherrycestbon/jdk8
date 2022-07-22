package com.example.jdk8.string;

/**
 * @author lenovo
 */
public class SplitTest {
    public static void main(String[] args) {
        String t = "/file_upload/shebao/2020-03-01/ec8ab0f6-2c27-4023-a790-a8f48d19fc9e.png";
        String[] split = t.split("/");
        System.out.println(split);
    }
}
