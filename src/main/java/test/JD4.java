package test;

import java.util.*;

/**
 * Project: LearnJava
 * Package: test
 * Author:  Novemser
 * 2017/4/7
 */
public class JD4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Item> dataList = new TreeSet<>((o1, o2) -> {
            if (o1.equals(o2))
                return 0;
            Item i1 = (Item) o1;
            Item i2 = (Item) o2;
            if (i1.val < i2.val)
                return 1;
            return -1;
        });
        while (sc.hasNext()) {
            dataList.clear();
            int n = sc.nextInt();
            int v = sc.nextInt();
            int lineCnt = 0;
            while (n-- > 0) {
                lineCnt++;
                int type = sc.nextInt();
                int price = sc.nextInt();
                Item item = new Item(lineCnt, type, price);
                dataList.add(item);
            }
            List<Item> result = new ArrayList<>();
            Iterator iterator = dataList.iterator();
            while (iterator.hasNext()) {
                Item im = (Item) iterator.next();
                if (v > 0) {
                    v -= im.type;
                    if (v >= 0) {
                        result.add(im);
                    } else {
                        v += im.type;
                    }
                } else {
                    break;
                }
            }
            if (result.size() == 0) {
                System.out.println(0);
                System.out.println("No");
            } else {
                int maxPrice = 0;
                for (Item im : result) {
                    maxPrice += im.price;
                }
                System.out.println(maxPrice);
                Collections.sort(result, (o1, o2) -> {
                    if (o1.equals(o2))
                        return 0;
                    Item i1 = (Item) o1;
                    Item i2 = (Item) o2;

                    if (i1.lineCnt < i2.lineCnt)
                        return -1;
                    return 1;
                });
                for (int i = 0; i < result.size(); i++) {
                    Item im = result.get(i);
                    if (i != result.size() - 1) {
                        System.out.print(im.lineCnt + " ");
                    } else {
                        System.out.println(im.lineCnt);
                    }
                }
            }
        }
    }

    static class Item {
        public int type;
        public int price;
        public int lineCnt;
        public float val;

        public Item(int line, int type, int price) {
            lineCnt = line;
            this.type = type;
            this.price = price;
            val = price * 1.0f / type;
        }
    }
}
