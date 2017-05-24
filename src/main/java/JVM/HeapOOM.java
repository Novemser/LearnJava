package JVM;

import java.util.ArrayList;
import java.util.List;

/**
 * Project: LearnJava
 * Package: JVM
 * Author:  Novemser
 * 2017/3/23
 */
public class HeapOOM {
    // -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
    public static void main(String[] args) throws InterruptedException {
        List<OOMClass> list = new ArrayList<>();
        Thread.sleep(5000);
        while (true) {
            list.add(new OOMClass());
        }
    }

    static class OOMClass {

    }
}
