package InnerClasses;

/**
 * Created by hugansen on 2016/8/3.
 */
public class DoThis {
    void f() {
        System.out.println("Dothis.f()");
    }

    public class Inner {
        public DoThis outer() {
            return DoThis.this;
        }
    }

    public Inner inner() {
        return new Inner();
    }

    public static void main(String... args) {
        DoThis doThis = new DoThis();
        DoThis.Inner dtInner = doThis.inner();
        dtInner.outer().f();
    }
}
