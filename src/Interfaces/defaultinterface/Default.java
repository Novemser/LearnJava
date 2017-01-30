package Interfaces.defaultinterface;

/**
 * 从Java8 开始，在接口中也可以定义静态方法和默认方法
 *
 * Project: LearnJava
 * Package: Interfaces
 * Author:  Novemser
 * 2016/11/7
 */
public interface Default {

    static Integer ILoveYou() {
        return 521;
    }

    void hehe();

    default void print() {
        System.out.println("I am default");
    }

    public static void main(String[] args) {
        Default n = new Default() {
            @Override
            public void hehe() {

            }
        };

        n.print();
    }
}
