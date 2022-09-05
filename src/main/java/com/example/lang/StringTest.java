package com.example.lang;

import org.springframework.util.StringUtils;

/**
 * @author lenovo
 */
public class StringTest {
    public static void main(String[] args) {
        String filenameExtension = StringUtils.getFilenameExtension("MinIO-vs-HDFS-MapReduce-performance-comparison.pdf");
        System.out.println(filenameExtension);

        String key = "abc";
        String key2 = "efg";
        String content = "abcdefg";
        if(content.startsWith(key)){
            System.out.println("start");
        }
        if(content.contains(key)){
            System.out.println("contain");
        }
        if(content.endsWith(key2)){
            System.out.println("end");
        }

        String a = (String)null;
        System.out.println(a);

        String b = "a";
        String[] split = b.split(",");
        for (String s : split) {
            System.out.println(s);
        }
    }
}
