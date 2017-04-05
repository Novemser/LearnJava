package Concurrent;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Project: LearnJava
 * Package: Concurrent
 * Author:  Novemser
 * 2017/4/4
 */
public class Executers {
    public static void main(String[] args) {
        ExecutorService e1 = Executors.newCachedThreadPool();
        ExecutorService e2 = Executors.newFixedThreadPool(2);
        ExecutorService e3 = Executors.newScheduledThreadPool(3);
        ExecutorService e4 = Executors.newSingleThreadExecutor();
        ExecutorService e5 = Executors.newWorkStealingPool();
        CountDownLatch countDownLatch = new CountDownLatch(4);
        countDownLatch.countDown();
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
