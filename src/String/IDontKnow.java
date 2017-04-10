package String;

/**
 * Project: LearnJava
 * Package: String
 * Author:  Novemser
 * 2017/4/9
 */
public class IDontKnow {
    public static void main(String[] args) {
        String a = "abc";
        String b = "a" + new String("bc");
        String b1 = "a" + "bc";
        final String c1 = "a";
        final String c2 = "bc";
        String c3 = c1 + c2;
//        System.out.println(a == b);
        System.out.println(b1 == a);
//        System.out.println(b.intern() == "abc");
        String c = "a";
        String d = "bc";
        String e = c + d;
        System.out.println(e == a);
        System.out.println(c3 == a);

    }
}
