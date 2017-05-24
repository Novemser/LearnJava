package Interfaces;

/**
 * 工厂设计模式
 * 使得接口的实现与代码完全分离
 * Created by hugansen on 2016/8/1.
 */
interface ITestInterfaceInher extends Service {
    void interfaceCanDoInhertance();
}

interface Service {
    public static final int PARAMETER = 23333;

    void method1();

    void method2();
}

interface ServiceFactory {
    Service getService();
}

class Implementation1 implements Service {

    @Override
    public void method1() {
        System.out.println("Imp1 method1");
    }

    @Override
    public void method2() {
        System.out.println("Imp1 method2");
    }
}

class Implementation1Factory implements ServiceFactory {

    @Override
    public Service getService() {
        return new Implementation1();
    }
}

class Implementation2 implements Service {

    @Override
    public void method1() {
        System.out.println("Imp2 method1");

    }

    @Override
    public void method2() {
        System.out.println("Imp2 method2");

    }
}

class Implementation2Factory implements ServiceFactory {

    @Override
    public Service getService() {
        return new Implementation2();
    }
}

public class Factories {
    public static void serviceConsumer(ServiceFactory factory) {
        Service service = factory.getService();
        service.method1();
        service.method2();
    }

    public static void main(String...args) {
        serviceConsumer(new Implementation1Factory());
        serviceConsumer(new Implementation2Factory());
    }
}
