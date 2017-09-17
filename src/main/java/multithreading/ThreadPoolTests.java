package multithreading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

/**
 * @package multithreading
 * @Author Novemser
 * @Date 2017/9/12
 * <p>
 * Crafting with devotion.
 */
public class ThreadPoolTests {
    public static void main(String[] args) {
        ThreadPoolTests unsafeInThread = new ThreadPoolTests();
        unsafeInThread.init();
    }

    public ExecutorService service = Executors.newCachedThreadPool();

    public void init() {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(0, Integer.MAX_VALUE,
                60L, TimeUnit.SECONDS, new SynchronousQueue<>(false));


        List list = Arrays.asList(1, 2, 3, "eqr");
        List data = new ArrayList();

        for (int i = 0; i < 10; i++) {
            data.add(new Object());
        }
        list.addAll(data);

        list.parallelStream().forEach(System.out::println);
    }
}
