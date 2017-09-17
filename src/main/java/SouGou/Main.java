package SouGou;

import java.util.Scanner;

/**
 * SouGou
 *
 * @Author Novemser
 * @Date 2017/8/28
 */
public class Main {
    //    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int a[] = new int[m];
//        Deque<Integer> deque = new LinkedList<>();
//
//        for (int i = 0; i < m; i++) {
//            a[i] = sc.nextInt();
//        }
//
//        int index = 0;
//        if (a[0] == 1) {
//            deque.offerFirst(a[1]);
//            index = 1;
//        } else {
//            deque.offerFirst(a[0]);
//        }
//        int cnt = 0;
//        for (int i = 0; ; i++) {
//            if (i == 0 && a[0] == 1) {
//                if (cnt++ < n) {
//                    System.out.println(1);
//                }
//            }
//
//            int cur = deque.pollFirst();
//            for (int j = 0; j < cur; j++) {
//                if (cnt++ < n) {
//                    System.out.println(a[index]);
//                    deque.offerLast(a[index]);
//                } else {
//                    return;
//                }
//            }
//
//            if (i == 0) {
//                deque.pollFirst();
//                if (deque.isEmpty()) {
//                    deque.offerFirst(a[(index + 1) % a.length]);
//                }
//            }
//            index = (index + 1) % a.length;
//        }
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int nums[] = new int[6];
            int sum = 0;
            for (int i = 0; i < 6; i++) {
                nums[i] = sc.nextInt();
                sum += nums[i];
            }
            if (sum == 0) return;
            System.out.println(2);
        }
    }
}
