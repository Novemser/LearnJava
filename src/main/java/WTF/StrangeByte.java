package WTF;

/**
 * Project: LearnJava
 * Package: WTF
 * Author:  Novemser
 * 2017/8/25
 */
public class StrangeByte {
    public static void main(String[] args) {
        // byte/char/short都需要转换成int后进行计算

        byte b1 = 1, b2 = 2, b5, b6;
        final byte b3 = 10, b4 = 11;
//        b5 = b1 + b2;
        b6 = (b3 + b4);
        System.out.println(b6);

        char c1 = '0', c2 = 'o';
//        char c3 = c1 + c2;

        short s1 = 0, s2 = 1;
//        short s3 = s1 + s2;
    }
}
