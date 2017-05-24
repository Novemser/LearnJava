package RTTI.TypeInfo;

import java.util.Random;

/**
 * Package:${PACKAGE_NAME}
 * Author:hugansen
 * Created on 2016/10/31.
 */

class Initable {
    static final int staticFinal1 = 42; // 对静态final常量的引用不会引发类初始化

    static final int staticFinal2 =
            ClassInitialization.random.nextInt(); // 对非常数静态域的初次引用会引发完整的类初始化

//    static final Initable2 staticInit2First =
//            new Initable2("Init init2First from init1");// 对非常数静态域的初次引用会引发完整的类初始化
//
//    static final Initable2 staticInit2Sec =
//            new Initable2("Init init2Second from init1");

    static {
        System.out.println("Initializing Initable");
    }

//    static Initable2 nonFinalInit2 =
//            new Initable2("Init non-final init2 in init1");
}

class Initable2 {
    static int staticNonFinal = 123; // 这里改成final就不会出发类初始化了
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
    // 1. static类变量、class initializer，和声明的顺序有关
    // 2. 非static成员变量、instance initializer，和声明的顺序有关
    // 3. instance构造器
//    static {
//        System.out.println("Initializing ClassInitialization");
//        System.out.println("Finished doing static code");
//        System.out.println("================================================");
//    }



//    public static Initable2 initable2 = new Initable2("static cons init2");
//    public static final Initable3 initable3 = new Initable3();

    public static Random random = new Random(233);

//    ClassInitialization() {
//        System.out.println("Constructing ClassInitialization");
//    }

//    public Initable2 initable2p = new Initable2("Field cons init2");
//    {
//        System.out.println("instance initializer");
//    }

    public static void main(String...args) throws ClassNotFoundException {
//        new ClassInitialization();
        Class initable = Initable.class;
        System.out.println("After creating Initable ref:");
        // This does not trigger initialization
        System.out.println(Initable.staticFinal1);
        // Does trigger initialization
        System.out.println(Initable.staticFinal2);
        System.out.println("------------------------------------");
        System.out.println(Initable2.staticNonFinal);
        System.out.println("------------------------------------");
        // Does trigger initialization
        Class initable3 = Class.forName("RTTI.TypeInfo.Initable3");
        System.out.println("After creating Initable3 ref");
        System.out.println(Initable3.staticNonFinal);
    }
}
