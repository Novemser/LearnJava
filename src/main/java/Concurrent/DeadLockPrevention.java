package Concurrent;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Project: LearnJava
 * Package: Concurrent
 * Author:  Novemser
 * 2017/3/30
 */
public class DeadLockPrevention {
    private ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {
        DeadLockPrevention dl = new DeadLockPrevention();
        Thread t1 = new Thread() {
            @Override
            public void start() {
                dl.MethodA();
            }
        };

        Thread t2 = new Thread() {
            @Override
            public synchronized void start() {
                dl.MethodB();
            }
        };

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void MethodA() {
        boolean lockResult = lock.tryLock();
        System.out.println("Method A lock " + lockResult);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lock.unlock();
    }

    private void MethodB() {
        boolean lockResult = lock.tryLock();
        System.out.println("Method B lock " + lockResult);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lock.unlock();
    }
}
