package RTTI.TypeInfo;

import java.util.Random;

/**
 * Package:${PACKAGE_NAME}
 * Author:hugansen
 * Created on 2016/10/31.
 */

class Initable {
    static final int staticFinal1 = 42;
    static final int staticFinal2 =
            ClassInitialization.random.nextInt(); // 对非常数静态域的初次引用会引发类初始化

    static {
        System.out.println("Initializing Initable");
    }
}

class Initable2 {
    static int staticNonFinal = 123;
    static {
        System.out.println("Initializing Initable2");
    }

    Initable2(String words) {
        System.out.println(words);
    }
}

class Initable3 {
    static int staticNonFinal = 321;
    static {
        System.out.println("Initializing Initable3");
    }
}

@SuppressWarnings("all")
public class ClassInitialization {
    // 初始化顺序：
    // 1. static class initializer
    // 2. static类变量
    // 3. 非static instance initializer
    // 4. 非static成员变量
    // 5. instance构造器
//    static {
//        System.out.println("Initializing ClassInitialization");
//        System.out.println("Finished doing static code");
//        System.out.println("================================================");
//    }
//    {
//        System.out.println("instance initializer");
//    }

//    public static Initable2 initable2 = new Initable2("static cons init2");
//    public static final Initable3 initable3 = new Initable3();

    public static Random random = new Random(233);

//    ClassInitialization() {
//        System.out.println("Constructing ClassInitialization");
//    }

//    public Initable2 initable2p = new Initable2("Field cons init2");

    public static void main(String...args) {
//        new ClassInitialization();
        Class initable = Initable.class;
        System.out.println("After creating Initable ref:");
        // This does not trigger initialization
        System.out.println(Initable.staticFinal1);
        // Does trigger initialization
        System.out.println(Initable.staticFinal2);
    }
}
