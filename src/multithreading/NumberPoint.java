package multithreading;

/**
 * Project: LearnJava
 * Package: multithreading
 * Author:  Novemser
 * 2017/3/7
 */
public class NumberPoint implements Runnable {
    public static int count = 5;
    public byte[] res;
    private int number;

    public NumberPoint(int num, byte[] arr) {
        number = num;
        res = arr;
    }

    public static void main(String args[]){
        final byte a[] = {0};//以该对象为共享资源
        new Thread(new NumberPoint((1),a),"1").start();
        new Thread(new NumberPoint((2),a),"2").start();
    }

    @Override
    public void run() {
        synchronized (res) {
            while (count-- > 0) {
                try {
                    res.notify();//唤醒等待res资源的线程，把锁交给线程（该同步锁执行完毕自动释放锁）
                    System.out.println(" " + number);
                    res.wait();//释放CPU控制权，释放res的锁，本线程阻塞，等待被唤醒。
                    System.out.println("------线程" + Thread.currentThread().getName() + "获得锁，wait()后的代码继续运行：" + number);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
