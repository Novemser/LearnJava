package Concurrent;

import java.util.concurrent.TimeUnit;

/**
 * Project: LearnJava
 * Package: Concurrent
 * Author:  Novemser
 * 2017/4/5
 */
public class SleepUtils {
    public static final void second(long seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
