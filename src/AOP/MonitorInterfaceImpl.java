package AOP;

/**
 * Project: LearnJava
 * Package: AOP
 * Author:  Novemser
 * 2017/3/30
 */
public class MonitorInterfaceImpl implements MonitorInterface {
    @Override
    public void doMonitor() {
        System.out.println("This is the method body");
        for (int i = 0; i < 999999999; i++) {
            System.out.printf("");
        }
    }
}
