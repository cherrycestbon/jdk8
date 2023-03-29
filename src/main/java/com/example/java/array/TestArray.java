package com.example.java.array;

/**
 * aa
 *
 * @author lenovo
 */
public class TestArray {
    /**
     * 1.5的新特性，不定项参数，当然int[]也可以，但是长度不好定义
     * 以上这个方法是一种简写形式，不用每次都自定义数组的长度，传几个整数它会自动将其封装成数组。
     * @param args
     */
    public static void main(String[] args) {
        show(2, 3, 4, 7, 9);
        delete(2, 3, 4, 7, 9);
    }

    public static void show(int... arr) {
        System.out.println(arr.length);
    }

    public static void delete(Integer... ids) {
        if (ids.length > 0) {
            StringBuffer sb = new StringBuffer();
            for (Integer id : ids) {
                sb.append(id).append(",");
            }
            sb.deleteCharAt(sb.length() - 1);
            System.out.println("delete from person where id in (" + sb + ")");
        }
    }
}
