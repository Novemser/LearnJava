package Async;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.*;

/**
 * Alibaba Group
 * Created by 晨烛 on 2017/7/27.
 */
public class FromTheFuture {
    private final ExecutorService pool = Executors.newFixedThreadPool(10);

    public String downloadContents(URL url) throws IOException {
        try (InputStream input = url.openStream()) {
            return IOUtils.toString(input, StandardCharsets.UTF_8);
        }
    }

    private void doFuture() throws Exception {
        Future<String> contentsFuture = startDownloading(new URL("http://www.baidu.com"));
        while (!contentsFuture.isDone()) {
            doComputation();
        }

        String result = contentsFuture.get();
        System.out.println("Result is : " + result);
        pool.shutdown();
    }

    private int cmpCount;

    private void doComputation() {
        try {
            Thread.sleep(100);
            System.out.println("Do computation " + cmpCount++);
        } catch (InterruptedException ignored) {}
    }

    /**
     * does not block, waiting for external website. Instead it returns immediately,
     * returning a lightweight Future<String> object. This object is a promise that
     * String will be available in the future.
     *
     * @param url
     * @return
     */
    private Future<String> startDownloading(URL url) {
        return pool.submit(() -> {
            try (InputStream stream = url.openStream()) {
                return IOUtils.toString(stream, StandardCharsets.UTF_8);
            }
        });
    }

    public static void main(String[] args) throws Exception {
        FromTheFuture fromTheFuture = new FromTheFuture();
        fromTheFuture.doFuture();

    }

    public void doTest() {
        CompletableFuture.supplyAsync(this::sendMessage)
                .thenAccept(this::notify);
    }

    private void notify(String s) {
        System.out.println("I am notified of msg:" + s);
    }

    private String sendMessage() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Hello, this is message";
    }
}
