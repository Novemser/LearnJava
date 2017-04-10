package StaticModifier;

/**
 * Project: LearnJava
 * Package: StaticModifier
 * Author:  Novemser
 * 2017/4/10
 */
public class ClassLoading {
    public static ClassLoading c1 = new ClassLoading();
    public static ClassLoading c2 = new ClassLoading();
    protected static int a = 22;

    static {
        System.out.println("StaticConstruct");
        System.out.println(a + 1);
    }

    {
        System.out.println(a);
    }

    public static void main(String[] args) {
        ClassLoading classLoading = new ClassLoading();
    }
}
