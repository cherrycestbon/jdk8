package com.example.jdk8.mapToLong;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class TestMapToLong {

    public static void main(String[] args) {
        //泛型类型只能是装箱类型
        List<Integer> list = new ArrayList<>();
        LongStream longStream = list.stream().mapToLong(Integer::longValue);
        Stream<Long> longStream1 = longStream.mapToObj(Long::new);
    }
}
