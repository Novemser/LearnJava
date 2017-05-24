package test;

import java.util.*;

/**
 * Project: LearnJava
 * Package: test
 * Author:  Novemser
 * 2017/4/6
 */
public class JD2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int s = sc.nextInt();

            TreeMap<Integer, Integer> mapB = new TreeMap();
            TreeMap<Integer, Integer> mapS = new TreeMap();
            while ((n--) > 0) {

                String sb = sc.next();
                if (sb.equals("B")) {
                    int money = sc.nextInt();
                    int time = sc.nextInt();
                    if (mapB.containsKey(money)) {
                        mapB.put(money, time + mapB.get(money));
                    } else
                        mapB.put(money, time);
                } else {
                    int money = sc.nextInt();
                    int time = sc.nextInt();
                    if (mapS.containsKey(money)) {
                        mapS.put(money, time + mapS.get(money));
                    } else
                        mapS.put(money, time);
                }

            }


            Stack<String> stack = new Stack();


            Set sets = mapS.keySet();
            Iterator its = sets.iterator();
            int count = 0;
            while (its.hasNext()) {
                int money = (Integer) its.next();
                int time = mapS.get(money);

                if (count++ < s)
                    stack.add("S " + money + " " + time);
                else
                    break;
            }
            while (!stack.isEmpty()) {
                System.out.println(stack.pop());
            }

            Set setb = mapB.keySet();
            Iterator itb = setb.iterator();
            count = 0;
            while (itb.hasNext()) {
                int money = (Integer) itb.next();
                int time = mapB.get(money);

                if (count++ >= mapB.size() - s)
                    stack.add("B " + money + " " + time);
            }
            while (!stack.isEmpty()) {
                System.out.println(stack.pop());
            }

        }

    }
}
