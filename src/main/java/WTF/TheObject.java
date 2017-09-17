package WTF;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.concurrent.Callable;

//class AB {
//    private static void doTest(Integer param1, Callable<String> callable) {
//        try {
//            String result = callable.call();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}

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

//        int i = 1 / 0;
        boolean result = "ddd".equalsIgnoreCase("DdD");

        System.out.println(result);

        int sum[] = new int[2];

//        System.out.println(o.equals("F"));
    }
}
