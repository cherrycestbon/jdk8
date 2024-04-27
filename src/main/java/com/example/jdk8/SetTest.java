package com.example.jdk8;

import org.springframework.util.StringUtils;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SetTest {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        String users = "2011000510,2011000245,2011000153";
        String[] usersId = users.split(",");
        if (usersId != null && usersId.length>0) {
            for (String uid : usersId) {
                set.add(uid);
            }
        }

        List<String> result = new ArrayList<>(set);
        String collect = result.stream().collect(Collectors.joining(","));
        System.out.println(collect);
        List<String> list = new ArrayList<>();
        Set<String> collect1 = list.stream().collect(Collectors.toCollection(HashSet::new));
        Optional<String> collect2 = list.stream().collect(Collectors.minBy(Comparator.comparing(String::toLowerCase)));
        StringJoiner stringJoiner = new StringJoiner(",");
        stringJoiner.add("1");
        stringJoiner.add("2");

        System.out.println(stringJoiner);

        BinaryOperator<Integer> b = (x, y) -> x+y;
        Optional<Integer> reduce = Stream.of(1, 2,3).reduce(b);
        Integer integer = reduce.get();
        System.out.println("result:" + integer);
    }
}
