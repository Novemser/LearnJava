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
        new ClassInMethod().getObj("Shit");
    }
}
