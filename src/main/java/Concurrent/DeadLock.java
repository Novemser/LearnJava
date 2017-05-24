package Concurrent;

/**
 * Project: LearnJava
 * Package: Concurrent
 * Author:  Novemser
 * 2017/3/22
 */

/*
Java stack information for the threads listed above:
===================================================
"Thread-1":
        at Concurrent.DeadLock.lambda$deadLock$1(DeadLock.java:34)
        - waiting to lock <0x0000000715c20fb0> (a java.lang.String)
        - locked <0x0000000715c20fe0> (a java.lang.String)
        at Concurrent.DeadLock$$Lambda$2/295530567.run(Unknown Source)
        at java.lang.Thread.run(Thread.java:745)
"Thread-0":
        at Concurrent.DeadLock.lambda$deadLock$0(DeadLock.java:27)
        - waiting to lock <0x0000000715c20fe0> (a java.lang.String)
        - locked <0x0000000715c20fb0> (a java.lang.String)
        at Concurrent.DeadLock$$Lambda$1/250421012.run(Unknown Source)
        at java.lang.Thread.run(Thread.java:745)

Found 1 deadlock.
 */

public class DeadLock {
    private static final String A = "a";
    private static final String B = "b";

    public static void main(String[] args) {
        new DeadLock().deadLock();
    }

    private void deadLock() {
        Thread thread1 = new Thread(() -> {
            synchronized (A) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (B) {
                    System.out.println("T1");
                }
            }
        });
        Thread thread2 = new Thread(() -> {
            synchronized (B) {
                synchronized (A) {
                    System.out.println("T2");
                }
            }
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static class AA {
        private String lA;
    }

    static class BB extends AA {

    }
}
