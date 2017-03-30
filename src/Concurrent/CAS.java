package Concurrent;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * Project: LearnJava
 * Package: Concurrent
 * Author:  Novemser
 * 2017/3/22
 */
public class CAS {
    /*
    CAS有三个操作数：内存值V、旧的预期值A、要修改的值B，
    当且仅当预期值A和内存值V相同时，将内存值修改为B并返回true，否则什么都不做并返回false。
     */
    public static void main(String[] args) {
        AtomicInteger integer = new AtomicInteger(10);
        integer.incrementAndGet();
        AtomicStampedReference<Integer> reference = new AtomicStampedReference<>(19, 2);

        int NCPU = Runtime.getRuntime().availableProcessors();
        System.out.println(NCPU);
    }

}
