package test;

import java.util.*;

/**
 * Project: LearnJava
 * Package: test
 * Author:  Novemser
 * 2017/3/25
 */
public class WangYi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < k; i++) {
            doMagic(a);
        }
        for (int i = 0; i < n; i++) {
            if (i != n - 1) {
                System.out.print(a[i] + " ");
            } else {
                System.out.println(a[i]);
            }
        }
    }

    public static void doMagic(int[] a) {
        int n = a.length;
        int first = a[0];
        for (int i = 0; i < n; i++) {
            if (i != n - 1) {
                a[i] = a[i] + a[i + 1];
            } else {
                a[i] = a[i] + first;
            }
            if (a[i] >= 100) {
                a[i] = a[i] % 100;
            }
        }
    }
}
