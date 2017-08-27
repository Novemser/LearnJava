package multithreading;

/**
 * Created by Novemser on 2016/9/20.
 */
public class LongDouble64 {
    private long data = 0;

    public void set1() {
        data = 0;
    }

    public void set2() {
        data = -1;
    }

    public void check() {

        System.out.println("Data:" + data);
        if (data != 0 && data != -1) {
            System.err.println("ERROR!");
        }
    }

    public static void main(String...args) {
        final LongDouble64 long64 = new LongDouble64();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    long64.set1();
                }
            }
        });
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    long64.set2();
                }
            }
        });
        thread2.start();

        Thread thread3 = new Thread(() -> {
            while (true) {
                long64.check();
            }
        });
        thread3.start();
    }
}
