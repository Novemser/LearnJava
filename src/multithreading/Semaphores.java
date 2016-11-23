package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

import static java.lang.Thread.sleep;

/**
 * Project: LearnJava
 * Package: multithreading
 * Author:  Novemser
 * 2016/11/23
 */
public class Semaphores {
    private volatile static double cnt = 0;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(20);

        Semaphore semaphore = new Semaphore(50);


        for (int i = 0; i < 2000; i++)
            executorService.submit(() -> {
                try {
                    semaphore.acquire();
                    System.out.println("Semaphore acquired:" + cnt++);
                    sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    semaphore.release();
                }
            });
        executorService.shutdown();
    }
}
