import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import com.mysql.jdbc.TimeUtil;
import org.junit.Test;

/**
 * Alibaba Group
 *
 * @author 晨烛
 * @project LearnJava
 * @date 2017/8/17
 */
public class TestLinkedBQ {
    private ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();
    private ExecutorService executorService = Executors.newFixedThreadPool(50);

    //@Test
    public long testSize() {
        for (int i = 0; i < 1000000; i++) {
            queue.offer(i);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < 50; i++) {
            executorService.submit(() -> {
                while (!queue.isEmpty()) {
                    synchronized (queue) {
                        queue.poll();
                    }
                }
            });
        }
        while (!queue.isEmpty()) {
        }
        long end = System.currentTimeMillis();
        System.out.println("Total time :" + (end - start));
        return end - start;
    }

    @Test
    public void testSpeed() {
        long total = 0L;
        for (int i = 0; i < 10; i++) {
            total += testSize();
        }
        System.out.println("Final:" + total);
    }

    @Test
    public void testIOSpeed() {
        long s = System.nanoTime();
        System.out.println("IO");
        //int i = 1 - 9;
        long e = System.nanoTime();
        System.out.println("Time:" + (e - s));
        long duration = TimeUnit.MICROSECONDS.convert(e - s, TimeUnit.NANOSECONDS);
        System.out.println(duration);
    }
}
