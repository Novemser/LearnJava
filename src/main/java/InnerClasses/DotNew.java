package InnerClasses;

/**
 * Created by hugansen on 2016/8/3.
 */
public class DotNew {
    public class Inner {
    }

    public static void main(String... args) {
        DotNew dotNew = new DotNew();
        // .new 语法用于初始化一个内部类
        DotNew.Inner inner = dotNew.new Inner();
    }

}
