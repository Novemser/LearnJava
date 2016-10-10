package DesignPatterns.Observer.Simple;

import java.util.Vector;

/**
 * Project: LearnJava
 * Package: DesignPatterns.Observable.Simple
 * Author:  Novemser
 * 2016/10/10
 */
public class Observable {
    private boolean changed;
    private Vector<Observer> observers;

    public Observable() {
        observers = new Vector<>();
    }

    public synchronized void addObserver(Observer observer) {
        if (!observers.contains(observer))
            observers.addElement(observer);
    }

    public synchronized void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        notifyObservers(null);
    }

    public void notifyObservers(Object arg) {
        Object[] arrLocal;
        synchronized (this) {
            if (!changed)
                return;
            arrLocal = observers.toArray();
            clearChanged();
        }

        for (int i = arrLocal.length - 1; i >= 0; i--)
            ((Observer)arrLocal[i]).update(this, arg);

    }

    private void clearChanged() {
        changed = false;
    }
}
