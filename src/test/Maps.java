package test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Project: LearnJava
 * Package: test
 * Author:  Novemser
 * 2017/3/21
 */
public class Maps {
    // 如果不重写HashCode，equals，没用
    private static class KeyClass {
        @Override
        public String toString() {
            return super.toString();
        }
    }

    private static class ValueClass {
        int nu;
        public ValueClass(int num) {
            nu = num;
        }

        @Override
        public String toString() {
            return String.valueOf(nu);
        }
    }

    public static void main(String[] args) {
        HashMap<KeyClass, ValueClass> map = new HashMap<>();
        Collections.synchronizedMap(map);

        map.put(new KeyClass(), new ValueClass(2));
        map.put(new KeyClass(), new ValueClass(3));

        for (Map.Entry<KeyClass, ValueClass> entry : map.entrySet()) {
            System.out.println("Key:" + entry.getKey() + " Value:" + entry.getValue());
        }
    }
}
