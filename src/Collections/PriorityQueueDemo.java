package Collections;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Project: LearnJava
 * Package: Collections
 * Author:  Novemser
 * 2016/10/8
 */
public class PriorityQueueDemo {
    public static void main(String...args) {
        // 反序比较器
        PriorityQueue<Integer> priorityQueue =
                new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < 100; i++) {
            priorityQueue.add(i);
        }
        priorityQueue.offer(222);
        System.out.println(priorityQueue);
    }
}
