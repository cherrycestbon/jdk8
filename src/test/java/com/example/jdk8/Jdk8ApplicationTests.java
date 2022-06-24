package com.example.jdk8;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

@SpringBootTest
class Jdk8ApplicationTests {

    @Test
    void contextLoads() {
        //调用工厂方法创建Optional实例
        Optional<String> name = Optional.of("Sanaulla");
        //传入参数为null，抛出NullPointerException.
        //Optional<String> someNull = Optional.of(null);

        //下面创建了一个不包含任何值的Optional实例
        //例如，值为'null'
        Optional empty = Optional.ofNullable(null);

        //ifPresent方法接受lambda表达式作为参数。
        //lambda表达式对Optional的值调用consumer进行处理。
        name.ifPresent((value) -> {
            System.out.println("The length of the value is: " + value.length());
        });
        name.ifPresent(value -> {
            System.out.println("The length of the value is: " + value.length());
        });

        //如果值不为null，orElse方法返回Optional实例的值。
        //如果为null，返回传入的消息。
        //输出：There is no value present!
        System.out.println(empty.orElse("There is no value present!"));
        //输出：Sanaulla
        System.out.println(name.orElse("There is some value!"));

        //orElseGet与orElse方法类似，区别在于orElse传入的是默认值，
        //orElseGet可以接受一个lambda表达式生成默认值。
        //输出：Default Value
        System.out.println(empty.orElseGet(() -> "Default Value"));
        //输出：Sanaulla
        System.out.println(name.orElseGet(() -> "Default Value"));

        //map方法执行传入的lambda表达式参数对Optional实例的值进行修改。
        //为lambda表达式的返回值创建新的Optional实例作为map方法的返回值。
        Optional<String> upperName = name.map((value) -> value.toUpperCase());
        System.out.println(upperName.orElse("No value found"));

        //flatMap与map（Function）非常类似，区别在于传入方法的lambda表达式的返回类型。
        //map方法中的lambda表达式返回值可以是任意类型，在map函数返回之前会包装为Optional。
        //但flatMap方法中的lambda表达式返回值必须是Optionl实例。
        upperName = name.flatMap((value) -> Optional.of(value.toUpperCase()));
        System.out.println(upperName.orElse("No value found"));//输出SANAULLA

        //filter方法检查给定的Option值是否满足某些条件。
        //如果满足则返回同一个Option实例，否则返回空Optional。
        Optional<String> longName = name.filter((value) -> value.length() > 6);
        System.out.println(longName.orElse("The name is less than 6 characters"));//输出Sanaulla
        //另一个例子是Optional值不满足filter指定的条件。
        Optional<String> anotherName = Optional.of("Sana");
        Optional<String> shortName = anotherName.filter((value) -> value.length() > 6);
        //输出：name长度不足6字符
        System.out.println(shortName.orElse("The name is less than 6 characters"));
    }

    @Test
    void contextLoads2() {
        Set<String> set = new TreeSet<>();
        set.add("12");
        set.add("63");
        set.add("3");
        for(Iterator iter = set.iterator(); iter.hasNext(); ) {
            System.out.printf("asc : %s\n", iter.next());
        }
        Set<String> set2 = new LinkedHashSet<>();
        set2.add("1");
        set2.add("1");
        set2.add("2");
        set2.add("3");
        set2.add("b");
        set2.add("3");
        set2.add("a");
        for(Iterator iter = set2.iterator(); iter.hasNext(); ) {
            System.out.printf("asc : %s\n", iter.next());
        }
    }

    @Test
    void contextLoads3() {
        int[] ints = {1, 2, 3};
        int[] ints1 = new int[3];
        ints1[0] = 1;
        ints1[1] = 2;
        ints1[2] = 3;
        Integer[] ints2 = new Integer[3];
        List<int[]> ints3 = Arrays.asList(ints1);
        ints3.forEach(item -> System.out.println(item));
    }

}
