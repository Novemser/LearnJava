package polymorphism;

/**
 * Created by 20728 on 2016/5/7.
 */
public class PrivateOverride {
    private void f() {
        System.out.println("private f()");
    }

    public static void main(String...args) {
        PrivateOverride po = new Derived();
        po.f();

        Derived d = new Derived();
        d.f();
    }
}

class Derived extends PrivateOverride {

    private void g() {

    }

    public void f() {
        System.out.println("public f()");
    }
}

/*
只有非private方法才可以被覆盖
 */