package test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Project: LearnJava
 * Package: test
 * Author:  Novemser
 * 2017/3/3
 */
public class ALI   {

//    @Override
//    protected Object clone() {
////        Object clone = super.clone();
//        return new ALI();
//    }

    public static void main(String[] args) {
        ALI ali = new ALI();
//        ali.Exxxx();
        ALI o1 = new ALI();
        ALI o2 = new ALI();
        Lock lock = new ReentrantLock();


//        map.put("name", "me");
        try {
            System.out.println(o1 + ":" + o1.clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
//        System.out.println(o1 + ":" + o1.clone());
    }

    static boolean resolve(int[] A) {
        if (A == null || A.length < 7)
            return false;

        int m1 = 0;
        int m2 = 3;
        int m3 = 5;
        int d[][] = new int[3][A.length];

        d[0][0] = A[m1];
        d[1][0] = A[m2];
        d[2][0] = A[m3];
        for (int i = 1; i < A.length; i++) {
            for (int j = 0; j < 3; j++) {

                d[j][i] = d[j][i - 1] + A[i];

            }
        }
        return false;
    }

    public void f1() {
        synchronized (this) {
            try {
                System.out.println("F1");
                Thread.sleep(1000);
                System.out.println("F1 Sleep");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public void f2() {
        synchronized (this) {

            try {
                System.out.println("F2");
                Thread.sleep(200000);
                System.out.println("F2 Sleep");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void Exxxx() {
        try {
            throw new IllegalArgumentException();
        } catch (Exception e) {
            StackTraceElement element = e.getStackTrace()[0];
            System.out.println("Line=" + element.getLineNumber());
        }
    }
}
