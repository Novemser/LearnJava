package Interfaces.defaultinterface;

/**
 * Project: LearnJava
 * Package: Interfaces.defaultinterface
 * Author:  Novemser
 * 2016/11/7
 */
public interface Son extends Default {
    @Override
    void hehe();

    @Override
    default void print() {
        System.out.println("I am advanced");
    }
}
