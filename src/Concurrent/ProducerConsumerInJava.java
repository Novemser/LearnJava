package Concurrent;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * Project: LearnJava
 * Package: Concurrent
 * Author:  Novemser
 * 2017/3/26
 */
public class ProducerConsumerInJava {
    public static void main(String[] args) {
        System.out.println("++++++++");
        Queue<Integer> queue = new LinkedList<>();
        ProducerConsumerInJava main = new ProducerConsumerInJava();
        Consumer consumer = main.new Consumer(queue);
        Producer producer = main.new Producer(queue, 10, "hahah");
        producer.start();
        consumer.start();
    }

    class Producer extends Thread {
        private Queue<Integer> queue;
        private int maxSize;

        public Producer(Queue<Integer> queue, int maxSize, String name) {
            super(name);
            this.queue = queue;
            this.maxSize = maxSize;
        }

        @Override
        public void run() {
            while (true) {
                synchronized (queue) {
                    while (queue.size() == maxSize) {
                        try {
                            System.out.println("Queue is full, " + "Producer thread:" + getName());
                            queue.wait();
                            System.out.println("Writer restart");
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    Random random = new Random();
                    int i = random.nextInt();
                    System.out.println("Producing value " + i);
                    queue.add(i);
                    queue.notifyAll();
                }
            }
        }
    }

    class Consumer extends Thread {
        private Queue<Integer> queue;

        public Consumer(Queue<Integer> queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            while (true) {
                synchronized (queue) {
                    while (queue.isEmpty()) {
                        try {
                            System.out.println("Queue is empty!");
                            queue.notifyAll();
                            Thread.sleep(1000);
//                            queue.wait();
                            System.out.println("Reader restart");
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    System.out.println("Consuming value:" + queue.poll());
//                    queue.notifyAll();
                }
            }
        }
    }
}
