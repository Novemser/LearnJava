package polymorphism;

/**
 * This is a template
 * Created by Novemser on 2016/5/7.
 */
public class PrivateOverride {
    private void f() {
        System.out.println("private f()");
    }

    String process() {
        return "Base process";
    }

    public static void main(String... args) {
        PrivateOverride po = new Derived();
        po.f();

        Derived d = new Derived();
        d.f();
    }
}

class Derived extends PrivateOverride {

    private void g() {

    }

    String process() {
        return (super.process());
    }

    public void f() {
        System.out.println("public f()");
    }
}

/*
只有非private方法才可以被覆盖
 */