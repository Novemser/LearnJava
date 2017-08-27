package test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Project: LearnJava
 * Package: test
 * Author:  Novemser
 * 2017/3/6
 */
public class AtomicIntegerWithLock {

    static int staticValue = 0;
    private int value;
    private Lock lock = new ReentrantLock();

    public AtomicIntegerWithLock() {
        super();
    }

    public AtomicIntegerWithLock(int value) {
        this.value = value;
    }

    public static void main(String[] args) throws Exception {
        final int max = 10;
        final int loopCount = 100000;

        long costTime = 0;
        for (int m = 0; m < max; m++) {
            long start1 = System.nanoTime();
            final AtomicIntegerWithLock value1 = new AtomicIntegerWithLock(0);
            Thread[] ts = new Thread[max];
            for (int i = 0; i < max; i++) {
                ts[i] = new Thread(() -> {
                    for (int i1 = 0; i1 < loopCount; i1++) {
                        value1.incrementAndGet();
                    }
                });
            }
            for (Thread t : ts) {
                t.start();
            }
            for (Thread t : ts) {
                t.join();
            }
            long end1 = System.nanoTime();
            costTime += (end1 - start1);
        }
        System.out.println("cost1: " + (costTime));
        //
        System.out.println();
        costTime = 0;
        //
        final Object lock = new Object();
        for (int m = 0; m < max; m++) {
            staticValue = 0;
            long start1 = System.nanoTime();
            Thread[] ts = new Thread[max];
            for (int i = 0; i < max; i++) {
                ts[i] = new Thread(() -> {
                    for (int i12 = 0; i12 < loopCount; i12++) {
                        synchronized (lock) {
                            ++staticValue;
                        }
                    }
                });
            }
            for (Thread t : ts) {
                t.start();
            }
            for (Thread t : ts) {
                t.join();
            }
            long end1 = System.nanoTime();
            costTime += (end1 - start1);
        }
        //
        System.out.println("cost2: " + (costTime));
    }

    public final int get() {
        lock.lock();
        try {
            return value;
        } finally {
            lock.unlock();
        }
    }

    public final void set(int newValue) {
        lock.lock();
        try {
            value = newValue;
        } finally {
            lock.unlock();
        }

    }

    public final int getAndSet(int newValue) {
        lock.lock();
        try {
            int ret = value;
            value = newValue;
            return ret;
        } finally {
            lock.unlock();
        }
    }

    public final boolean compareAndSet(int expect, int update) {
        lock.lock();
        try {
            if (value == expect) {
                value = update;
                return true;
            }
            return false;
        } finally {
            lock.unlock();
        }
    }

    public final int getAndIncrement() {
        lock.lock();
        try {
            return value++;
        } finally {
            lock.unlock();
        }
    }

    public final int getAndDecrement() {
        lock.lock();
        try {
            return value--;
        } finally {
            lock.unlock();
        }
    }

    public final int incrementAndGet() {
        lock.lock();
        try {
            return ++value;
        } finally {
            lock.unlock();
        }
    }

    public final int decrementAndGet() {
        lock.lock();
        try {
            return --value;
        } finally {
            lock.unlock();
        }
    }

    public String toString() {
        return Integer.toString(get());
    }
}