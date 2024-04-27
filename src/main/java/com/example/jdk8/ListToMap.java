package com.example.jdk8;

import com.example.bean.House;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author lenovo
 */
public class ListToMap {

    public static void main(String[] args) {
        House house = new House(1,1,"aa","北京海淀");
        House house1 = new House(2,2,"bb","湖北武汉");
        House house2 = new House(3,3,"cc","浙江杭州");
        ArrayList<House> houses = new ArrayList<>();
        houses.add(house);
        houses.add(house1);
        houses.add(house2);

        Map<String, String> collect = houses.stream().collect(Collectors.toMap(h -> h.getHousename(), h -> h.getAddress()));

        //在实际项目中我们经常会用到 List 转 Map 操作 ->过去是for循环的操作，现在可以学习如下的方法Collectors.toMap
        /**
         * 我们收集一下集合中每个对象的两个单独的属性
         */
        Map<String, String> mapHouse = houses.stream().collect(Collectors.toMap(House::getHousename, House::getAddress));
        System.out.println(mapHouse);
        //{aa=湖北武汉, bb=浙江杭州, cc=北京海淀}

        /**
         * 前后的属性的数据类型要对应  一般时间业务中收集带有唯一表示的业务数据
         */
        Map<Integer, String> map = houses.stream().collect(Collectors.toMap(House::getOwnerid, House::getHousename));
        System.out.println(map);
        //{1=aa, 2=bb, 3=cc}

        /**
         * 收集一下属性和对象本身
         */
        Map<Integer, House> houseMap = houses.stream().collect(Collectors.toMap(House::getOwnerid, o -> o));
        Map<Integer, House> houseMap1 = houses.stream().collect(Collectors.toMap(House::getOwnerid,  Function.identity()));
        System.out.println(houseMap);
        /**
         * {1=House{id=1, ownerid=1, housename='aa', address='北京海淀'},
         * 2=House{id=2, ownerid=2, housename='bb', address='湖北武汉'},
         * 3=House{id=3, ownerid=3, housename='cc', address='浙江杭州'}}
         */

        //业务场景：一般会根据具体的键值 取具体的对象
        System.out.println(houseMap.get(1));
        //House{id=1, ownerid=1, housename='aa', address='北京海淀'}

        //此处的效果同houseMap
        System.out.println(houseMap1);
        /**
         * {1=House{id=1, ownerid=1, housename='aa', address='北京海淀'},
         * 2=House{id=2, ownerid=2, housename='bb', address='湖北武汉'},
         * 3=House{id=3, ownerid=3, housename='cc', address='浙江杭州'}}
         */

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        Long result = integerList.stream().collect(Collectors.counting());

    }
}
