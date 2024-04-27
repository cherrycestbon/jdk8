package com.example.jdk8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

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

        String[] strArr = new String[]{"a","b","c"};
        List<String> collect1 = Arrays.stream(strArr).collect(Collectors.toList());
        ArrayList<String> collect2 = Arrays.stream(strArr).collect(Collectors.toCollection(ArrayList::new));
        ArrayList<String> collect3 = Arrays.stream(strArr).collect(Collectors.toCollection(() -> new ArrayList<>()));
        System.out.println(collect1);
        System.out.println(collect2);

    }
}
