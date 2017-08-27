package test;

import java.util.Scanner;

/**
 * Project: LearnJava
 * Package: test
 * Author:  Novemser
 * 2017/3/20
 */
public class MTDP {
    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int len = n;
            for	(int i = 0; i < n; i++) {
                a[i] = i;
            }
            int i = 0;
            int j = i + 1;
            int preLen = n, newLen = 0;
            while (preLen != 1) {
                i = 0;
                j = i + 1;
                while (j < preLen) {
                    swap(a, i, j);
                    newLen++;
                    i++;
                    j = j + 2;
                }
                preLen = newLen;
                newLen = 0;
            }
            System.out.println(a[0]);
        }
    }
}
