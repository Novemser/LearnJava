package String;

/**
 * Project: LearnJava
 * Package: String
 * Author:  Novemser
 * 2016/10/15
 */
public class Concatenation {
    public static void main(String...args) {
        String a = "Hello";
        // 编译器会自动优化成StringBuider的实现
        String b = "abc " + a + " def " + 55;
        System.out.println(b);
    }
}
