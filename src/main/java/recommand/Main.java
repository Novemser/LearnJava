package recommand;

/**
 * Project: LearnJava
 * Package: recommand
 * Author:  Novemser
 * 2017/6/4
 */
public class Main {
    public static void main(String[] args) {
        byte [][] a = new byte[540000][540000];
        for (int i = 0; i < a.length; i++) {
            byte[] tmp = a[i];
            for (int j = 0; j < tmp.length; j++) {
                tmp[j] = 1;
            }
        }
    }
}
