package DesignPatterns.Observer.tutorialspoint;

import java.util.ArrayList;
import java.util.List;

/**
 * Project: LearnJava
 * Package: DesignPatterns.Observer.tutorialspoint
 * Author:  Novemser
 * 2016/11/7
 */
public class Subject {
    private List<Observer> observers =
            new ArrayList<>();

    private int data;

    public void attatch(Observer observer) {
        if (observer != null)
            observers.add(observer);
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
        notifyAllObservers();
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
