package InnerClasses;

/**
 * Created by hugansen on 2016/8/3.
 */

interface Incrementable {
    void increment();
}

class Callee1 implements Incrementable {
    private int count = 0;

    @Override
    public void increment() {
        count++;
        System.out.println("Callee1 increment:" + count);
    }
}

class MyIncrement {
    public void increment() {
        System.out.println("Other operation");
    }

    static void f(MyIncrement myIncrement) {
        myIncrement.increment();
    }

}

class Callee2 extends MyIncrement {
    private int count = 0;

    public void increment() {
        super.increment();
        count++;
        System.out.println("Callee2 increment:" + count);
    }

    public void otherFunc() {
        System.out.println("Other function called in callee2");
    }

    // Closure
    private class Closure implements Incrementable {

        @Override
        public void increment() {
            Callee2.this.increment();
            otherFunc();
        }
    }

    Incrementable getCallbackReference() {
        return new Closure();
    }
}

/**
 * 如果又想继承又想实现
 * 接口方法会被基类方法覆盖。。
 */
class Callee3 extends MyIncrement implements Incrementable {

}

class Caller {
    private Incrementable callbackRef;

    Caller(Incrementable incrementable) {
        callbackRef = incrementable;
    }

    void go() {
        callbackRef.increment();
    }
}

public class Callbacks {
    public static void main(String... a) {
        Callee1 callee1 = new Callee1();
        Callee2 callee2 = new Callee2();
//        MyIncrement.f(callee2);
//
//        Caller caller1 = new Caller(callee1);
//        caller1.go();
//        Caller caller2 = new Caller(callee2.getCallbackReference());
//        caller2.go();
//        caller2.go();
        Caller caller3 = new Caller(new Callee3());
        caller3.go();
    }
}
