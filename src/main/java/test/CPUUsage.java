package test;

/**
 * Project: LearnJava
 * Package: test
 * Author:  Novemser
 * 2016/10/8
 */
public class CPUUsage {
    // Using 100% CPU on E3-1230V3
    public static void main(String...args) {
        for (int i = 0; i < 8; i++) {
            new Thread(() -> {
                while (true);
            }).start();
        }
    }
}
