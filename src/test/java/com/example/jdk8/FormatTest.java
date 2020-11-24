package com.example.jdk8;

import com.example.jdk8.util.MathUtil;
import com.example.jdk8.util.NumUtil;
import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

public class FormatTest {
    @Test
    void contextLoads() {
        System.out.println("abc");
        double add = MathUtil.add(1d, 2d, 3d, 4d, 5d);
        System.out.println(add);
        String s = NumUtil.keepRandomPoint(669.8d, 3);
        System.out.println(s);

        String s2 = NumUtil.keepZero(1);
        System.out.println("-----:"+s2);

        double d1 = 123456.36987, d2 = 12.3698;
        DecimalFormat nf = new DecimalFormat("0000.000");
        System.out.println("d1=" + nf.format(d1) + " d2=" + nf.format(d2));

        nf = new DecimalFormat("#");
        System.out.println("d1=" + nf.format(d1));//d1=123456

        nf = new DecimalFormat(".####");
        System.out.println("d1=" + nf.format(d1));//d1=123456.3699

        String s3 = NumUtil.keep(0.23);
        System.out.println("-----:"+s3);
    }
}
