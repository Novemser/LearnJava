package String;

/**
 * Project: LearnJava
 * Package: String
 * Author:  Novemser
 * 2017/3/25
 */
public class StringIndexOf {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str.indexOf("l", 1));
        System.out.println(str.indexOf("l", 3));
        Object s = new Object();
        System.out.println(str.hashCode());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
