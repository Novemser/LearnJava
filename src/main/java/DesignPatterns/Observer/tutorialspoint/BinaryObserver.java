package DesignPatterns.Observer.tutorialspoint;

/**
 * Project: LearnJava
 * Package: DesignPatterns.Observer.tutorialspoint
 * Author:  Novemser
 * 2016/11/7
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        subject.attatch(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String:" +
        Integer.toBinaryString(subject.getData()));
    }
}
