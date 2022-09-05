package com.example.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author lenovo
 */

//保留的环境
@Retention(RetentionPolicy.RUNTIME)
//注释起作用的位置，此处表示它只能给类、接口、枚举注解
@Target(ElementType.TYPE)
public @interface Test {
    public int id() default -1;
    public String msg() default "Hi";
}
