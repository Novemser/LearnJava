package InnerClasses;

/**
 * 用匿名内部类实现的工厂模式
 * Created by hugansen on 2016/8/3.
 */

/**
 * 接口中的任何域都是 static final的
 */
interface Service {
    void method1();

    void method2();
}

interface ServiceFactory {
    Service getService();
}

/**
 * 一个文件似乎只能由一个public类
 */
//错误！必须放置在新的文件中
//public class className{
//
//}

class Implementation1 implements Service {
    @Override
    public void method1() {
        System.out.println("Imp1 m1");
    }

    @Override
    public void method2() {
        System.out.println("Imp1 m2");
    }

    static ServiceFactory factory = new ServiceFactory() {
        @Override
        public Service getService() {
            return new Implementation1();
        }
    };
}

class Implementation2 implements Service {
    @Override
    public void method1() {
        System.out.println("Imp2 m1");
    }

    @Override
    public void method2() {
        System.out.println("Imp2 m2");
    }

    // 这个lambda的我看不懂= =
    static ServiceFactory factory = Implementation2::new;
}

public class Factories {
    public static void serviceConsumer(ServiceFactory factory) {
        Service service = factory.getService();
        service.method1();
        service.method2();
    }

    public static void main(String... s) {
        serviceConsumer(Implementation1.factory);
        serviceConsumer(Implementation2.factory);

    }
}
