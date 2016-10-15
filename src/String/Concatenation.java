package String;

/**
 * Project: LearnJava
 * Package: String
 * Author:  Novemser
 * 2016/10/15
 */
public class Concatenation {
    public static void main(String...args) {
        String mango = "Mao ze dong";
        // 编译器会自动优化成StringBuider的实现
        String s = "abc " + mango + " xijinping " + 55;
        System.out.println(s);
    }
}
