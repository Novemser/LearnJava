package WTF;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * Project: LearnJava
 * Package: WTF
 * Author:  Novemser
 * 2017/8/26
 */
public class TheObject {
    public static void main(String[] args) {
        Object o = new Object() {
            @Override
            public boolean equals(Object obj) {
                return true;
            }
        };

        Scanner scanner = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        System.out.print(deque);

        int i = 1 / 0;

        int sum[] = new int[2];

        System.out.println(o.equals("F"));
    }
}
