package WTF;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Qihu {
    //    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int m, n, a, b, c, d, x, y, z;
//        n = scanner.nextInt();
//        m = scanner.nextInt();
//        a = scanner.nextInt();
//        b = scanner.nextInt();
//        c = scanner.nextInt();
//        d = scanner.nextInt();
//        x = scanner.nextInt();
//        y = scanner.nextInt();
//        z = scanner.nextInt();
//
//        double p1 = 1.0 * x / (a + b);
//        double p2 = 1.0 * y / c;
//        double p3 = 1.0 * z / d;
//        int sum = 0;
//        if (p1 > Math.max(p2, p3)) {
//            int p1Count = Math.min(n / a, m / b);
//            sum += p1Count * x;
//            n -= p1Count * a;
//            m -= p1Count * b;
//            int p2Count = m / c;
//            sum += p2Count * y;
//
//            int p3Count = n / d;
//            sum += p3Count * z;
//        } else if (p2 > Math.max(p1, p3)) {
//            // Go p2
//            int p2Count = m / c;
//            sum += p2Count * y;
//            m -= p2Count * c;
//
//            if (p1 > p3) {
//                // GO p1
//                int p1Count = Math.min(n / a, m / b);
//                sum += p1Count * x;
//                n -= p1Count * a;
//                m -= p1Count * b;
//                // Go p3
//                int p3Count = n / d;
//                sum += p3Count * z;
//            } else {
//                // Go p3
//                int p3Count = n / d;
//                sum += p3Count * z;
//                n -= p3Count * d;
//                // Go p1
//                int p1Count = Math.min(n / a, m / b);
//                sum += p1Count * x;
//            }
//        } else {
//            // Go p3
//            int p3Count = n / d;
//            sum += p3Count * z;
//            n -= p3Count * d;
//            if (p1 > p2) {
//                // GO p1
//                int p1Count = Math.min(n / a, m / b);
//                sum += p1Count * x;
//                n -= p1Count * a;
//                m -= p1Count * b;
//                // Go p2
//                int p2Count = m / c;
//                sum += p2Count * y;
//            } else {
//                // Go p2
//                int p2Count = m / c;
//                sum += p2Count * y;
//                m -= p2Count * c;
//                // Go p1
//                int p1Count = Math.min(n / a, m / b);
//                sum += p1Count * x;
//            }
//        }
//        System.out.println(sum);
//    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
////        int num[] = new int[n + 1];
//        int data[] = new int[n + 1];
//
//        for (int i = 0; i < n; i++) {
//            data[i] = scanner.nextInt();
//        }
//
//        for (int i = 0; i < n; i++) {
//            int cur = data[i];
//            int cnt = 0;
//            for (int j = 0; j < i; j++) {
//                if (data[j] > cur) {
//                    cnt++;
//                }
//            }
//
//            if (i != n - 1) {
//                System.out.print(cnt + " ");
//            } else {
//                System.out.print(cnt);
//            }
//
////            for (int j = 0; j < data[i] - 1; j++) {
////                num[j]++;
////            }
//        }
//    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int aList[] = new int[n];
//        for (int i = 0; i < n; i++) {
//            aList[i] = scanner.nextInt();
//        }
//
//        int m = scanner.nextInt();
//        int bList[] = new int[m];
//        for (int i = 0; i < m; i++) {
//            bList[i] = scanner.nextInt();
//        }
//        int dp[][] = new int[n][m];
//
//
//        int sumA = Arrays.stream(aList).sum();
//        int sumB = Arrays.stream(bList).sum();
//    }
    public static void main(String[] args) {
        double db = 1;
        byte bb = 1;
        char cb = 1;

        // 不能把更高级的类型向下赋值
//        float fb = 1.0 / 0.0;
//        int d = 1.0;
        double db1 = 1.0 / 0.0;
        int ib = 1 / 0;
    }
}
