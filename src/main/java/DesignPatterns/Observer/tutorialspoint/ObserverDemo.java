package DesignPatterns.Observer.tutorialspoint;

/**
 * Project: LearnJava
 * Package: DesignPatterns.Observer.tutorialspoint
 * Author:  Novemser
 * 2016/11/7
 */
public class ObserverDemo {
    public static void main(String[] args) {
        Subject s = new Subject();
        s.setData(123);

        new HexaObserver(s);
        new BinaryObserver(s);
        s.setData(3333);
        s.setData(1);
    }
}
