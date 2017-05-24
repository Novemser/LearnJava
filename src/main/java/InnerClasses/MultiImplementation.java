package InnerClasses;

/**
 * Created by hugansen on 2016/8/3.
 */

class D {
    private String youGuess() {
        return "N";
    }
}

abstract class E {
    abstract void func();
}

class Z extends D {
    E makeE() {

        return new E() {
            @Override
            void func() {

            }
        };
    }
}


public class MultiImplementation {
    private static void takesD(D d) {
    }

    private static void takesE(E e) {
    }

    public static void main(String... args) {
        Z z = new Z();
        takesD(z);
        takesE(z.makeE());
    }

}
