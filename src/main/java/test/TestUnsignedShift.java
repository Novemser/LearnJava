package test;

/**
 * Project: LearnJava
 * Package: test
 * Author:  Novemser
 * 2017/5/1
 */
public class TestUnsignedShift {
    public static void main(String[] args) {
        int val = -41;
        System.out.println(Integer.toBinaryString(val));
        System.out.println(Integer.toBinaryString(val >>> 1));// 无符号移位

        val = -val;
        System.out.println(Integer.toBinaryString(val));
        System.out.println(Integer.toBinaryString(val >>> 1));
    }
}
