package Concurrent;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/**
 * Project: LearnJava
 * Package: Concurrent
 * Author:  Novemser
 * 2017/3/26
 */
public class MultiThreadInfo {
    public static void main(String[] args) {
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        ThreadInfo[] infos = threadMXBean.dumpAllThreads(false, false);
        for (ThreadInfo info : infos) {
            System.out.println("[" + info.getThreadId() + "] " + info.getThreadName());
//            System.out.println(info.toString());
        }
    }
}
