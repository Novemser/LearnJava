package DesignPatterns.Singleton;

/**
 * Created by Novemser on 2016/9/19.
 */
public class ThreadSafeDoubleCheckLocking {
    private static volatile ThreadSafeDoubleCheckLocking instance;

    private ThreadSafeDoubleCheckLocking() {
        // 防止通过反射机制调用私有方法
        if (instance != null) {
            throw new IllegalStateException("Already initialized!");
        }
    }

    public static ThreadSafeDoubleCheckLocking getInstance() {

        // 确保instance在已经初始化的情况下只访问一次
        // 这样可以提高性能?（《Effective Java》 2nd.ver）
        // 经过测试 好像并没有提高
        ThreadSafeDoubleCheckLocking field = instance;

        if (field == null) {

            synchronized (ThreadSafeDoubleCheckLocking.class) {

                field = instance;
                if (field == null) {
                    instance = new ThreadSafeDoubleCheckLocking();
                }

            }
        }

        return instance;
    }

}
