package AOP;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Project: LearnJava
 * Package: AOP
 * Author:  Novemser
 * 2017/3/30
 */
public class DynamicHandler implements InvocationHandler {
    private Object target;

    public DynamicHandler(Object target) {
        this.target = target;
    }

    public static void main(String[] args) {
        MonitorInterface monitor = new MonitorInterfaceImpl();

        DynamicHandler handler = new DynamicHandler(monitor);

        MonitorInterface proxy = (MonitorInterface) Proxy.newProxyInstance(
                monitor.getClass().getClassLoader(),
                monitor.getClass().getInterfaces(),
                handler
        );

        proxy.doMonitor();
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Before invoke");
        long start = System.currentTimeMillis();
        Object obj = method.invoke(target, args);
        long elasped = System.currentTimeMillis() - start;
        System.out.println("After invoke");
        System.out.println("Calling time: " + elasped);
        return obj;
    }
}
