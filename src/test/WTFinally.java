package test;

/**
 * Project: LearnJava
 * Package: test
 * Author:  Novemser
 * 2017/3/27
 */
public class WTFinally {
    public static void main(String[] args) {
//        WTFinally wtFinally = new WTFinally();
//        System.out.println(wtFinally.FinallyReturn());
//        System.out.println(wtFinally.FinallyNoReturn());
        Integer.toString(10, 16);

    }

    public int FinallyReturn() {
        int i;

        try {
            i = 10;
            return i;
        } catch (Exception e) {
            e.printStackTrace();
            i = 15;
            return i;
        } finally {
            i = 20;
            return i;
        }
    }

    public int FinallyNoReturn() {
        int i;

        try {
            i = 10;
            return i;
        } finally {
            i = 20;
        }
    }
}
