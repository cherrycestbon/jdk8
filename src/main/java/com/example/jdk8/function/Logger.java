package com.example.jdk8.function;

import java.util.function.Supplier;

public class Logger {
    public void debug(Supplier<String> message){
        System.out.println(message.get());;
    }
}
