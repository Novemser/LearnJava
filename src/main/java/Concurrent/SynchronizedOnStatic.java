package Concurrent;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Project: LearnJava
 * Package: Concurrent
 * Author:  Novemser
 * 2017/4/5
 */
public class SynchronizedOnStatic {
    static ScheduledExecutorService service = Executors.newScheduledThreadPool(2);

    public static synchronized void m1() {
        System.out.println("M1");
        SleepUtils.second(1);
    }

    public static synchronized void m2() {
        System.out.println("M2");
        SleepUtils.second(1);
    }

    public static void main(String[] args) {
        service.scheduleAtFixedRate(SynchronizedOnStatic::m1, 0, 1, TimeUnit.SECONDS);
        service.scheduleAtFixedRate(SynchronizedOnStatic::m2, 0, 1, TimeUnit.SECONDS);

//        new Thread(SynchronizedOnStatic::m1).start();
//        new Thread(SynchronizedOnStatic::m2).start();
    }
}
