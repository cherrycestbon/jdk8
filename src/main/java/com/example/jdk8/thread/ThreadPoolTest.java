package com.example.jdk8.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolTest {
    public static void main(String[] args) throws InterruptedException {
        // 创建线程池
        ExecutorService threadPool = Executors.newFixedThreadPool(5);

        // 通过execute方法用线程池执行一个任务
        threadPool.execute(() -> System.out.println("Task1"));

        // 通过submit方法可获取线程执行结果
        //没有参数，所以用();只有一行代码，省略了return.
        Future<Object> future = threadPool.submit(() -> "Task2");

        try {
            Object obj = future.get();
            System.out.println(obj);

            // 可设置超时时间
            // future.get(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException");
        } catch (ExecutionException e) {
            System.out.println("ExecutionException");
        }
    }
}
