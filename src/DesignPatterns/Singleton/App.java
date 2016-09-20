package DesignPatterns.Singleton;

/**
 * Tips:
 * 1. 经过MAX_ITE的实验，函数中的本地变量比Class中的成员变量的访问要快得多，所以尽量用本地变量。
 * 2. 饿汉式单例加载技术、Holder静态单例加载技术比双重检查锁快得多，并且三者都是线程安全的。
 * Created by Novemser on 2016/9/20.
 */
public class App {

    public static long getCurrentTime() {
        return System.currentTimeMillis();
    }

    public static void main(String...args) {
        App app = new App();
        long startTime, endTime;

        // Eagerly initialized static instance guarantees thread safety.
        int MAX_ITE = 1000000000;
        startTime = getCurrentTime();
        for(int i = 0; i < MAX_ITE; i++) {
            IvoryTower.gerInstance();
        }
        endTime = getCurrentTime();
        System.out.println("Hungry initialization time:" + (endTime - startTime));

        // Double check locking, thread safe.
        startTime = getCurrentTime();
        for (int i = 0; i < MAX_ITE; i++) {
            ThreadSafeDoubleCheckLocking.getInstance();
        }
        endTime = getCurrentTime();
        System.out.println("Lazy initialization time:" + (endTime - startTime));

        // On demand holder
        startTime = getCurrentTime();
        for (int i =  0; i < MAX_ITE; i++) {
            InitializationOnDemandHolder.getInstance();
        }
        endTime = getCurrentTime();
        System.out.println("On demand holder time:" + (endTime - startTime));
    }
}
