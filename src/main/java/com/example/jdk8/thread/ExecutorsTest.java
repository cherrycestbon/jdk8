package com.example.jdk8.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class ExecutorsTest {
    public static void main(String[] args) {
        //线程数固定，适用需要限制线程数，负载较重的场景。
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        //单线程，保证线程按顺序执行
        ExecutorService executorService1 = Executors.newSingleThreadExecutor();
        //线程数量不固定，适合短期异步任务，负载较轻的场景。有耗尽资源的风险。
        ExecutorService executorService2 = Executors.newCachedThreadPool();
        //线程数固定
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(10);
        //单线程，适用按顺序执行的场景。
        ScheduledExecutorService scheduledExecutorService1 = Executors.newSingleThreadScheduledExecutor();

    }
}
