package Collections;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Project: LearnJava
 * Package: test
 * Author:  Novemser
 * 2016/10/7
 */
public class ArraysTester {
    public static void main(String...args) {
        String[] strings = new String[11];
        strings[2] = "heheda";
        List<String> list = Arrays.asList(strings);
        for (String string : list) {
            System.out.println(string);
        }
        LinkedList<String> linkedList = new LinkedList<>(
                Arrays.asList("2,3", "heheda")
        );

        linkedList.poll();
        linkedList.pollLast();
        linkedList.getLast();
    }
}
