package DesignPatterns.Observer.tutorialspoint;

/**
 * Project: LearnJava
 * Package: DesignPatterns.Observer.tutorialspoint
 * Author:  Novemser
 * 2016/11/7
 */
public class HexaObserver extends Observer {
    public HexaObserver(Subject subject) {
        this.subject = subject;
        subject.attatch(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String:" +
        Integer.toHexString(subject.getData()));
    }
}
