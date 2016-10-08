package Collections;

import java.util.AbstractQueue;
import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.function.Consumer;

/**
 * Project: LearnJava
 * Package: Collections
 * Author:  Novemser
 * 2016/10/8
 */
public class PriorityQueueDemo extends AbstractQueue {
    @Override
    public Iterator iterator() {
        return new Itr();
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean offer(Object o) {
        return false;
    }

    @Override
    public Object poll() {
        return 1;
    }

    @Override
    public Object peek() {
        return 0;
    }

    private final class Itr implements Iterator {

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Object next() {
            return null;
        }

        @Override
        public void remove() {

        }

        @Override
        public void forEachRemaining(Consumer action) {

        }
    }

    public static void main(String...args) {
        // 反序比较器
        PriorityQueue<Integer> priorityQueue =
                new PriorityQueue<>(Collections.reverseOrder());
        priorityQueue.poll();
        priorityQueue.iterator();
        for (int i = 0; i < 100; i++) {
            priorityQueue.add(i);
        }
        priorityQueue.offer(222);
        System.out.println(priorityQueue);
    }
}
