package test;

import java.util.*;

/**
 * Project: LearnJava
 * Package: test
 * Author:  Novemser
 * 2017/4/6
 */
public class JD {
    public static void main(String[] args) {
        int n, s;
        Scanner scanner = new Scanner(System.in);
        class inn implements Comparator<Integer> {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1.equals(o2)) {
                    return 0;
                }

                if (o1 < o2) {
                    return 1;
                }
                return -1;
            }
        }
        Map<Integer, Integer> sellList = new TreeMap<>(new inn());
        Map<Integer, Integer> buyList = new TreeMap<>(new inn());
        while (scanner.hasNext()) {
            n = scanner.nextInt();
            s = scanner.nextInt();

            while (n-- > 0) {

                String sb = scanner.next();
                Integer price = scanner.nextInt();
                Integer quantity = scanner.nextInt();
                if (sb.equals("S")) {
                    if (sellList.containsKey(price)) {
                        sellList.put(price, sellList.get(price) + quantity);
                    } else
                        sellList.put(price, quantity);
                } else {
                    if (buyList.containsKey(price)) {
                        buyList.put(price, buyList.get(price) + quantity);
                    } else
                        buyList.put(price, quantity);
                }
            }

            List<Integer> keys = new ArrayList<>(sellList.keySet());
            for (int i = keys.size() - s; i < keys.size() && i < s; i++) {
                if (i < 0)
                    continue;
                System.out.println("S " + keys.get(i) + " " + sellList.get(keys.get(i)));
            }

            keys = new ArrayList<>(buyList.keySet());
            for (int i = 0; i < keys.size() && i < s; i++) {
                System.out.println("B " + keys.get(i) + " " + buyList.get(keys.get(i)));
            }
            sellList.clear();
            buyList.clear();
        }
    }
}
