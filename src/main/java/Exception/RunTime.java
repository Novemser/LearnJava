package Exception;

/**
 * Project: LearnJava
 * Package: Exception
 * Author:  Novemser
 * 2017/4/12
 */
public class RunTime {
    public static void main(String[] args) {
        RuntimeException e = new ArithmeticException();
        Double[] a = new Double[2];
        a[1] =(Double) ((Object) new Integer(22));
//        int a2 = 2 / 0;
//        throw e;
        Error error = new StackOverflowError("@#@!#");
        throw error;
    }
}
