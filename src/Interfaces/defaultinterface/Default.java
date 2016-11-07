package Interfaces.defaultinterface;

/**
 * Project: LearnJava
 * Package: Interfaces
 * Author:  Novemser
 * 2016/11/7
 */
public interface Default {

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
