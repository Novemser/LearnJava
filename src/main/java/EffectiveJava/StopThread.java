package EffectiveJava;

import java.util.concurrent.TimeUnit;

/**
 * 永远不会终止的程序。。。。
 * Created by Novemser on 2016/9/19.
 */
public class StopThread {
    private static boolean stopRequired;
    // 你觉得他会跑多久？
    public static void main(String...args)
     throws InterruptedException {
        Thread backgroundThread = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                /*
                  虚拟机会把下面的代码变成：
                  if (!stopRequired)
                    while(true)
                        i++;
                  这种优化成为提升(hoisting)
                 */
                while (!stopRequired)
                    i++;
            }
        });

        backgroundThread.start();

        TimeUnit.SECONDS.sleep(1);
        stopRequired = true;
    }
}
