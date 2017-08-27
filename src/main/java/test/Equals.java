package test;

import java.util.ArrayList;
import java.util.List;

/**
 * Project: LearnJava
 * Package: test
 * Author:  Novemser
 * 2017/2/28
 */
public class Equals {
    public static void main(String[] args) {
        Double i = new Double(3);
        Double j = 3d;
        Double m = 3d;
        System.out.println(i == j);
        System.out.println(j == m);

        String s = "hello";

        String t = "hello";

        StringBuffer s1 = new StringBuffer("2");
        StringBuffer s2 = new StringBuffer("2");

        char c[] = {'h', 'e', 'l', 'l', 'o'};
        List<String> ls = new ArrayList<>();

        System.out.println(c);
        System.out.printf("sadasd").println();

    }

    float f0() {
        short i = 0;
        return i;
    }
}
