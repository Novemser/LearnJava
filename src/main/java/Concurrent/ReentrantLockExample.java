package Concurrent;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Project: LearnJava
 * Package: Concurrent
 * Author:  Novemser
 * 2017/3/23
 */
public class ReentrantLockExample {
    int a = 0;
    private ReentrantLock lock = new ReentrantLock();

    public void writer() {
        lock.lock();

        try {
            a++;
        } finally {
            lock.unlock();
        }
    }

    public void reader() {
        lock.lock();

        try {
            int i = a;
            System.out.println("Val:" + i);
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {

    }
}
