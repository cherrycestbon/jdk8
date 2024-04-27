package com.example.jdk8.stream;

import java.util.stream.Stream;

public class TestReduce {
    public static void main(String[] args) {
        Integer reduce = Stream.of(1, 2, 3).reduce(0, (acc, element) -> acc + element);
        System.out.println(reduce);
    }
}
