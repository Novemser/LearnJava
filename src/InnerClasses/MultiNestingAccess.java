package InnerClasses;

/**
 * 多级嵌套
 * Created by hugansen on 2016/8/3.
 */
class MNA {
    private void first() {
        System.out.println("First");
    }

    class A {
        private void second() {
            System.out.println("Second");
        }
        // 第三层可以调用前两层的方法
        public class B {
            void third() {
                first();
                second();
                System.out.println("Third");
            }
        }
    }
}

public class MultiNestingAccess {
    public static void main(String... args) {
        MNA mna = new MNA();
        MNA.A a = mna.new A();
        MNA.A.B b = a.new B();
        b.third();
    }
}
