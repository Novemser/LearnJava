package InnerClasses;

import java.io.Serializable;

/**
 * Created by hugansen on 2016/8/3.
 */

public class ClassInMethod {
    public Contents contents() {

        // 参数被用在匿名类里需要final
        final int heheda = 9;
        // 啊 原来这是一个接口 新建的时候会自动生成需要重写的方法
        // 很想Android里创建一个Click listener的逻辑

        // 这里实际上是创建了一个新的实现了Contents接口的类
        // 只不过木有名字
        return new Contents() {
            // 还可以自定义成员对象
            private int i = 0;

            @Override
            public int value() {
                return heheda;
            }
        };
    }

    public void methodClass() {
        String greetingStr = getClass().getName();

        class InnerMethodClass {
            public void greeting() {
                System.out.println(greetingStr);
            }
        }

        new InnerMethodClass().greeting();
    }

    class ObjInCls {
        // 普通内部类不能有静态字段
        // 原因如下：
        // 实际上普通的内部类是外部类的一个成员变量
        // 这个内部类只有在外部类实例化以后，才能被实例化
        // 而静态成员不依赖上面这个条件
        // 静态成员在类第一次被加载的时候就放在内存了
        // 不需要外部类先初始化以后才能使用内部了
        // 这与已知条件矛盾
        /* Example
            static int o1 = 1; compile time error
         */

        int o2 = 9;

        // BUT:
        // you can declare static fields if they are
        // constants and are written in compile time.
        static final int MAX_VAL = 100000;
    }

    public Contents getContent() {
        // 用lambda化简……
        return () -> 0;
    }

    public Object getObj(String str) {

        class TempObj implements Serializable {
            private String value;

            private TempObj(String s) {
                value = s;
            }

            private Object getObjString() {
                return value;
            }
        }

        return new TempObj(str);
    }

    public static void main(String... args) {
        ClassInMethod method = new ClassInMethod();
        method.getObj("Shit");
        int objVal = ObjInCls.MAX_VAL;
        method.methodClass();
    }
}
