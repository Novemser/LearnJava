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

    public static void main(String[] args) {
//        String a = args[1];
//        String b = args[2];
//        String c = args[3];
//        System.out.println("Arg1:" + a);
        String str = "2333";
        switch (str) {
            case "2333":
                System.out.println("sss");
                break;
            case "2":
                System.out.println("ddd");
                break;
        }
        throw new RuntimeException("23333");
    }

}
