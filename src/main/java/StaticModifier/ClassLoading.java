package StaticModifier;

/**
 * Project: LearnJava
 * Package: StaticModifier
 * Author:  Novemser
 * 2017/4/10
 */
public class ClassLoading {
    //    public static ClassLoading c1 = new Son();
//    public static ClassLoading c2 = new ClassLoading();
    protected static int a = 22;

    static {
        System.out.println("StaticConstruct");
//        System.out.println(a + 1);
    }

    {
        System.out.println("这里是Father");
    }

    public ClassLoading() {
        System.out.println("Father DefaultConstruct");
        run();
    }

    public static void main(String[] args) {
        ClassLoading classLoading = new Son();
    }

    protected void run() {
        System.out.println("Father");
    }
}

class Son extends ClassLoading {
    private int a = 1;

    protected void run() {
        System.out.println("Son val " + a);
    }

    public Son() {
        System.out.println("Son constructor");
    }

    {
        System.out.println("这里是Son");
    }

    static {
        System.out.println("static son");
    }
}