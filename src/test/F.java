package test;

/**
 * Project: LearnJava
 * Package: test
 * Author:  Novemser
 * 2017/3/25
 */
public class F {
    public F() throws Exception {
        throw new Exception("F");
    }

    public static void main(String[] args) throws Exception {
//        String a = args[1];
//        String b = args[2];
//        String c = args[3];
//        System.out.println("Arg1:" + a);
        new F();
    }

}
