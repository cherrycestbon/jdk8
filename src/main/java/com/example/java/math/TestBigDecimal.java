package com.example.java.math;

import java.math.BigDecimal;

/**
 * @author lenovo
 */
public class TestBigDecimal {
    public static void main(String[] args) {
        double dayDiff2 = 5.06135778;
        BigDecimal usedM = new BigDecimal(dayDiff2);
        System.out.println(usedM);
        //保留两位小数且四舍五入
        usedM = usedM.setScale(2, BigDecimal.ROUND_HALF_UP);
        System.out.println(usedM);
    }
}
